package com.example.testspring.service;

import com.example.testspring.entity.CategorieClient;
import com.example.testspring.entity.Client;
import com.example.testspring.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class IClientServiceIMP implements IClientService {

    @Autowired
    ClientRepository clientRepository;

    @Override
    public List<Client> retrieveAllClients() {
        return clientRepository.findAll();
    }

    @Override
    public Client addClient(Client c) {
        return clientRepository.save(c);
    }

    @Override
    public void deleteClient(Long id) {
        clientRepository.deleteById(id);

    }

    @Override
    public Client updateClient(Client c) {
        return clientRepository.save(c);
    }

    @Override
    public Client retrieveClient(Long id) {
        return clientRepository.findById(id).orElse(null);
    }

    public float getChiffreAffaireParCategorieClient(CategorieClient categorieClient,
                                                     Date startDate, Date endDate) {


        return clientRepository;
    }

}
