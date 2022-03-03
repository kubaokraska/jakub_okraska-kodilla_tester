package com.kodilla.mockito.homework;

import com.kodilla.mockito.notification.ClientExistException;

import java.util.*;

public class ClientService {
    Map<String, Client> subscribers = new HashMap<>();

    ///////////////////////////////// ADD CLIENT
    public void addZakopaneClient(Client client) {
        this.subscribers.put("Zakopane", client);
    }

    public void addHelClient(Client client){
        this.subscribers.put("Hel", client);
    }

    public void addGizyckoClient(Client client){
        this.subscribers.put("Gizycko", client);
    }

    //////////////////////////////// SEND NOTIFICATION
    public void sendGlobalNotification(GlobalNotification globalNotification) {
        Set <Client> clientsGlobalNotification = new HashSet<>();
        for (Map.Entry<String, Client> subscriber : subscribers.entrySet())
            clientsGlobalNotification.add(subscriber.getValue());

        clientsGlobalNotification.forEach(client -> client.receiveGlobalNotification(globalNotification));
    }

    public void sendZakopaneNotification(LocalNotification localNotification) {
        for (Map.Entry<String, Client> subscriber : subscribers.entrySet()) {

            System.out.println(subscriber);
            if (Objects.equals(subscriber.getKey(), "Zakopane"))
                subscriber.getValue().receiveLocalNotification(localNotification);
        }
    }

    public void sendHelNotification(LocalNotification localNotification) {
        for (Map.Entry<String, Client> subscriber : subscribers.entrySet()) {
           System.out.println(subscriber);
            if (Objects.equals(subscriber.getKey(), "Hel")) {
                subscriber.getValue().receiveLocalNotification(localNotification);
            }
        }
    }

    public void sendGizyckoNotification(LocalNotification localNotification) {
        for (Map.Entry<String, Client> subscriber : subscribers.entrySet()) {
            if (Objects.equals(subscriber.getKey(), "Gizycko"))
                subscriber.getValue().receiveLocalNotification(localNotification);
        }
    }

    public void removeLocation (String location){
        subscribers.remove(location);
    }

    //////////////////////////////// REMOVE
    public void removeClientFromEveryLocalisation(Client client) {
        subscribers.remove("Zakopane", client);
        subscribers.remove("Hel", client);
        subscribers.remove("Gizycko", client);
    }

    public void removeClientFromZakopane(Client client) {
        subscribers.remove("Zakopane", client);
    }

    public void removeClientFromHel(Client client) {
        subscribers.remove("Hel", client);;
    }

    public void removeClientFromGizycko(Client client) {
        subscribers.remove("Gizycko", client);
    }
}