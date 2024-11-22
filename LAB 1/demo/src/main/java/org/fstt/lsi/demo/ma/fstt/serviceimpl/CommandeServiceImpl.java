package org.fstt.lsi.demo.ma.fstt.serviceimpl;

import jakarta.inject.Inject;
import org.fstt.lsi.demo.ma.fstt.entities.Commande;
import org.fstt.lsi.demo.ma.fstt.repository.CommandeRepository;
import org.fstt.lsi.demo.ma.fstt.service.CommandeService;

public class CommandeServiceImpl implements CommandeService {
    @Inject
    private CommandeRepository commandeRepository;

    @Override
    public Commande findCommandeById(String id) {
        return commandeRepository.trouverById(id);
    }

    @Override
    public void saveCommande(Commande commande) {
        commandeRepository.ajouterCommande(commande);
    }

}
