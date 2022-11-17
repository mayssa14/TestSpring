package com.example.testspring.entity;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Collections;
import java.util.List;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Produit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // gerer par la base
    private long idProduit;
    private String codeProduit;
    private String libelleProfduit;
    private  float prixUnitaire;

    @ManyToOne(cascade = CascadeType.PERSIST)
    private Rayon rayon;

    @ManyToMany(cascade = CascadeType.ALL)
    private List<Produit> produits ;


    @OneToOne(mappedBy = "produit")
    private  Stock stock;

    @OneToOne(mappedBy = "produits")
    private  DetailsProduit categorieProduit;

    @OneToMany (mappedBy = "produits")
    private List<DetailFacture> detailFactures;




}
