package org.fstt.lsi.demo.ma.fstt.service;

import org.fstt.lsi.demo.ma.fstt.entities.Client;

public interface  ClientService {
    Client findClientById(String id);
    void addClient(Client client);
    public void saveClient(Client client);
}
