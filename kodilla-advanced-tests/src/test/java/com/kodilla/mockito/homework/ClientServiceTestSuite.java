package com.kodilla.mockito.homework;

import com.kodilla.mockito.notification.ClientExistException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertThrows;

class ClientServiceTestSuite {
    /////////// CHECK BeforeEch ////////////
    ClientService clientService = new ClientService();
    GlobalNotification globalNotification = Mockito.mock(GlobalNotification.class);
    LocalNotification localNotification = Mockito.mock(LocalNotification.class);

    Client helClient = Mockito.mock(Client.class);
    Client gizyckoClient = Mockito.mock(Client.class);
    Client zakopaneClient = Mockito.mock(Client.class);
    Client allClient = Mockito.mock(Client.class);


    @Test
    public void receiveGlobalNotification() {
        Mockito.verify(allClient, Mockito.times(1)).receiveGlobalNotification(globalNotification);
   Mockito.verify(helClient, Mockito.times(1)).receiveGlobalNotification(globalNotification);
    }

    @Test
    public void notReceiveLocalNotificationFromDifferentLocation() {
        clientService.sendGlobalNotification(globalNotification);
        clientService.sendHelNotification(localNotification);
        clientService.sendGizyckoNotification(localNotification); // 2nd notification
        clientService.sendZakopaneNotification(localNotification);
        // System.out.println(clientService.subscribers.get("Hel"));

        Mockito.verify(gizyckoClient, Mockito.times(2)).receiveLocalNotification(localNotification);
    }

    @Test
    public void notReceiveLocalNotificationAfterRemoveFromLocation() {
        clientService.removeClientFromHel(helClient);
        clientService.sendHelNotification(localNotification); // 2nd notification
        clientService.sendHelNotification(localNotification); // 3rd notification

        Mockito.verify(helClient, Mockito.times(5)).receiveLocalNotification(localNotification);
    }

    @Test
    public void receiveNotificationFromManyLocation() {
        Mockito.verify(allClient, Mockito.times(3)).receiveLocalNotification(localNotification);
    }

    @Test
    public void notReceiveLocalNotificationAfterRemoveFromAllLocations() {
        clientService.removeClientFromEveryLocalisation(allClient);

        clientService.sendHelNotification(localNotification); // 4th notification for: "allClient"
        clientService.sendZakopaneNotification(localNotification); // 5th notification for: "allClient"
        clientService.sendGizyckoNotification(localNotification);// 6th notification for: "allClient"
        clientService.sendGlobalNotification(globalNotification); // 2nd global notification for: "allClient"

        Mockito.verify(allClient, Mockito.times(3)).receiveLocalNotification(localNotification);
        Mockito.verify(allClient, Mockito.times(1)).receiveGlobalNotification(globalNotification);
    }

    @Test
    public void notReceiveLocalNotificationAfterRemoveLocation() {
        clientService.sendHelNotification(localNotification);//4h notification
        clientService.sendGlobalNotification(globalNotification);
        clientService.removeLocation("Hel");
        clientService.sendHelNotification(localNotification);
        clientService.sendGlobalNotification(globalNotification);

        Mockito.verify(allClient, Mockito.times(4)).receiveLocalNotification(localNotification);
        //  Mockito.verify(allClienton, Mockito.times(2)).receiveGlobalNotification(globalNotification);
    }

    @BeforeEach
    public void addClientsAndSendNotification(){
        clientService.addHelClient(helClient);
        clientService.addGizyckoClient(gizyckoClient);
        clientService.addZakopaneClient(zakopaneClient);

        clientService.addHelClient(allClient);
        clientService.addGizyckoClient(allClient);
        clientService.addZakopaneClient(allClient);

        clientService.sendGlobalNotification(globalNotification);
        clientService.sendHelNotification(localNotification);
        clientService.sendGizyckoNotification(localNotification);
        clientService.sendZakopaneNotification(localNotification);
    }
}