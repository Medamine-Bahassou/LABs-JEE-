package org.fstt.lsi.demo.ma.fstt.repository;

import org.fstt.lsi.demo.ma.fstt.entities.Produit;

public interface ProduitRepository {
    Produit trouverById(String id);
    void ajouterProduit(Produit produit);

}
