package org.fstt.lsi.demo.ma.fstt.service;

import org.fstt.lsi.demo.ma.fstt.entities.Produit;

public interface ProduitService {
    Produit findProduitById(String id);
    void saveProduit(Produit produit);

}
