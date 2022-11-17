package com.example.testspring.service;

import com.example.testspring.entity.Fournisseur;
import com.example.testspring.entity.Produit;
import com.example.testspring.repository.FournisseurRepository;
import com.example.testspring.repository.ProduitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IFournisseurServiceIMPL implements IFournisseurService{

    @Autowired
    ProduitRepository produitRepository;
    @Autowired
    FournisseurRepository fournisseurRepository;


    @Override
    public Fournisseur assignFournisseurToProduit(Long fournisseurId, Long produitId) {
        Produit produit = produitRepository.findById(produitId).get();
        Fournisseur fourni = fournisseurRepository.findById(fournisseurId).get();

        fourni.getProduit().add(produit);
        return fournisseurRepository.save(fourni);
    }
    }

