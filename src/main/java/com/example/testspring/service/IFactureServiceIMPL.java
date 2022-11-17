package com.example.testspring.service;


import com.example.testspring.entity.Facture;
import com.example.testspring.repository.FactureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IFactureServiceIMPL implements IFactureService{

    @Autowired
    FactureRepository factureRepository;


    @Override
    public List<Facture> retrieveAllFactures() {
        return factureRepository.findAll();

    }

    @Override
    public void cancelFacture(Long id) {
        factureRepository.deleteById(id);

    }

    @Override
    public Facture retrieveFacture(Long id) {
        return factureRepository.findById(id).orElse(null) ;

    }




}
