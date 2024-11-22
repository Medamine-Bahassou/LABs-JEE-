package org.fstt.lsi.demo.ma.fstt.repository;

import org.fstt.lsi.demo.ma.fstt.entities.Client;

public interface ClientRepository {
    Client trouverById(String id);
    void ajouterClient(Client client);
}
