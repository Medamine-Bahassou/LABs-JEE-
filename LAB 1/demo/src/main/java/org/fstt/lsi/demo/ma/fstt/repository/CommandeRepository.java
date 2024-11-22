package org.fstt.lsi.demo.ma.fstt.repository;

import org.fstt.lsi.demo.ma.fstt.entities.Commande;

public interface CommandeRepository {
    Commande trouverById(String id);
    void ajouterCommande(Commande commande);
    // Other methods

}
