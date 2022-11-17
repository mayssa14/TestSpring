package com.example.testspring.service;


import com.example.testspring.entity.Produit;

import java.util.List;

public interface IProduitService {
    List<Produit> retrieveAllProduits();

    Produit addProduit(Produit p, Long idRayon, Long idStock);

    Produit retrieveProduit(Long id);

    Produit assignProduitToStock(Long idProduit, Long idStock);
}
