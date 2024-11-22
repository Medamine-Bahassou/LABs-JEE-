package org.fstt.lsi.demo.ma.fstt.serviceimpl;

import jakarta.inject.Inject;
import org.fstt.lsi.demo.ma.fstt.entities.Produit;
import org.fstt.lsi.demo.ma.fstt.repository.ProduitRepository;
import org.fstt.lsi.demo.ma.fstt.service.ProduitService;

public class ProduitServiceImpl implements ProduitService {
    @Inject
    private ProduitRepository produitRepository;

    @Override
    public Produit findProduitById(String id) {
        return produitRepository.trouverById(id);
    }

    @Override
    public void saveProduit(Produit produit) {
        produitRepository.ajouterProduit(produit);
    }
}
