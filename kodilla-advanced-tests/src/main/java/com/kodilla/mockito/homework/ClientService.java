package com.kodilla.mockito.homework;

import com.kodilla.mockito.notification.ClientExistException;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ClientService {
    List<Client> clients = new ArrayList<>();
    Set<Client> zakopaneClients = new HashSet<>();
    Set<Client> helClients = new HashSet<>();
    Set<Client> gizyckoClients = new HashSet<>();
    protected final static int numberOfLocations = 3;

    ///////////////////////////////// ADD CLIENT
    public void addZakopaneClient(Client client) throws ClientExistException {
        if (zakopaneClients.contains(client))
            throw new ClientExistException();

        this.clients.add(client);
        this.zakopaneClients.add(client);
    }

    public void addHelClient(Client client) throws ClientExistException {
        if (helClients.contains(client))
            throw new ClientExistException();

        this.clients.add(client);
        this.helClients.add(client);
    }

    public void addGizyckoClient(Client client) throws ClientExistException {
        if (gizyckoClients.contains(client))
            throw new ClientExistException();

        this.clients.add(client);
        this.gizyckoClients.add(client);
    }

    //////////////////////////////// SEND NOTIFICATION
    public void sendGlobalNotification(GlobalNotification globalNotification) {
        Set<Client> clientsSet = new HashSet<>(clients);
        clientsSet.forEach(client -> client.receiveGlobalNotification(globalNotification));
    }

    public void sendZakopaneNotification(LocalNotification localNotification) {
        this.zakopaneClients.forEach(client -> client.receiveLocalNotification(localNotification));
    }

    public void sendHelNotification(LocalNotification localNotification) {
        this.helClients.forEach(client -> client.receiveLocalNotification(localNotification));
    }

    public void sendGizyckoNotification(LocalNotification localNotification) {
        this.gizyckoClients.forEach(client -> client.receiveLocalNotification(localNotification));
    }

    //////////////////////////////// REMOVE
    public void removeClientFromEveryLocalisation(Client client) {
        helClients.remove(client);
        gizyckoClients.remove(client);
        zakopaneClients.remove(client);

        for (int i = 0; i < numberOfLocations; i++)
            clients.remove(client);
    }

    public void removeClientFromZakopane(Client client) {
        zakopaneClients.remove(client);
        clients.remove(client);
    }

    public void removeClientFromHel(Client client) {
        helClients.remove(client);
        clients.remove(client);
    }

    public void removeClientFromGizycko(Client client) {
        gizyckoClients.remove(client);
        clients.remove(client);
    }
}