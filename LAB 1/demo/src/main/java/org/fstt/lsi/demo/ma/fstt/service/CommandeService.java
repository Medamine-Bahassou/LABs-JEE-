package org.fstt.lsi.demo.ma.fstt.service;

import org.fstt.lsi.demo.ma.fstt.entities.Commande;

public interface CommandeService {
    Commande findCommandeById(String id);
    void saveCommande(Commande commande);

}
