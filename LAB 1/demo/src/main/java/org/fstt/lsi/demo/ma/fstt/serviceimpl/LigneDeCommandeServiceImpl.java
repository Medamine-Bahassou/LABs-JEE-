package org.fstt.lsi.demo.ma.fstt.serviceimpl;

import jakarta.inject.Inject;
import org.fstt.lsi.demo.ma.fstt.entities.LigneDeCommande;
import org.fstt.lsi.demo.ma.fstt.repository.LigneDeCommandeRepository;
import org.fstt.lsi.demo.ma.fstt.service.LigneDeCommandeService;

public class LigneDeCommandeServiceImpl implements LigneDeCommandeService {
    @Inject
    private LigneDeCommandeRepository ligneDeCommandeRepository;

    @Override
    public void saveLigneDeCommande(LigneDeCommande ligne) {
        ligneDeCommandeRepository.ajouterLigneDeCommande(ligne);
    }
}
