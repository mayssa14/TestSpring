package com.example.testspring.service;

import com.example.testspring.entity.Fournisseur;

public interface IFournisseurService {
    public Fournisseur assignFournisseurToProduit(Long fournisseurId, Long produitId) ;
}
