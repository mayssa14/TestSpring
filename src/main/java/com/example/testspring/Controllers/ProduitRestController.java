package com.example.testspring.Controllers;

import com.example.testspring.entity.Client;
import com.example.testspring.entity.Produit;
import com.example.testspring.service.IProduitServiceIMP;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("produit")
public class ProduitRestController {

    @Autowired
    IProduitServiceIMP iProduitServiceIMP;

    @GetMapping("/getAll")
    public List<Produit> retrieveAllProduits()
    {
        return iProduitServiceIMP.retrieveAllProduits();
    }

    @PostMapping("/add")
    public Produit addProduit (@RequestBody Produit p, Long idRayon, Long idStock)
    {
        return  iProduitServiceIMP.addProduit(p, idRayon, idStock);
    }



    @GetMapping("/getOne/{idD}")
    public Produit retrieveProduit(@PathVariable(value = "idD") long idProduit)
    {
        return iProduitServiceIMP.retrieveProduit(idProduit);
    }


}
