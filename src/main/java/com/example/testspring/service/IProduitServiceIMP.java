package com.example.testspring.service;

import com.example.testspring.entity.Produit;
import com.example.testspring.entity.Rayon;
import com.example.testspring.entity.Stock;
import com.example.testspring.repository.ProduitRepository;
import com.example.testspring.repository.RayonRepository;
import com.example.testspring.repository.StockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class IProduitServiceIMP implements IProduitService {

    @Autowired
    ProduitRepository produitRepository;
    @Autowired
    RayonRepository rayonRepository;
    @Autowired
    StockRepository stockRepository;

    @Override
    public List<Produit> retrieveAllProduits() {
        return produitRepository.findAll();

    }

    @Override
    public Produit addProduit(Produit p, Long idRayon, Long idStock) {
        Rayon rayon= rayonRepository.findById(idRayon).orElse(null);
        Stock stock= stockRepository.findById(idStock).orElse(null);
        p.setRayon(rayon);
        p.setStock(stock);
        return produitRepository.save(p);
    }

    @Override
    public Produit retrieveProduit(Long id) {
        return produitRepository.findById(id).orElse(null) ;
    }

    @Override
    public Produit assignProduitToStock(Long idProduit, Long idStock) {
        Produit produit = produitRepository.findById(idProduit).get();
        Stock stock = stockRepository.findById(idStock).get();
        if ((produit !=null)&&(stock !=null))
        {
            produit.setStock(stock);
            return produitRepository.save(produit);
        }

        return null;
    }

}
