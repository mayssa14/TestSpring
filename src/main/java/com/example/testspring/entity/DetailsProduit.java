package com.example.testspring.entity;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class DetailsProduit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // gerer par la base
    private long idDetailsProduit;
    @Temporal(TemporalType.DATE)
    private Date dateCreation;
    @Temporal(TemporalType.DATE)
    private Date dateDernierModification;
    @Enumerated(EnumType.STRING)
    private CategorieProduit categorieProduits;

    @OneToOne
    private Produit produits;
}


