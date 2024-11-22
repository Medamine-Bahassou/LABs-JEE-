package org.fstt.lsi.demo.ma.fstt.serviceimpl;

import jakarta.inject.Inject;
import org.fstt.lsi.demo.ma.fstt.entities.Client;
import org.fstt.lsi.demo.ma.fstt.repository.ClientRepository;
import org.fstt.lsi.demo.ma.fstt.service.ClientService;

public class ClientServiceImpl implements ClientService {
    @Inject
    private ClientRepository clientRepository;

    @Override
    public Client findClientById(String id) {
        return clientRepository.trouverById(id);
    }

    @Override
    public void addClient(Client client) {

    }

    @Override
    public void saveClient(Client client) {
        clientRepository.ajouterClient(client);
    }

    // You can add more methods as needed, for example:
    // public List<Client> findAllClients();
    // public void deleteClient(String id);
}
