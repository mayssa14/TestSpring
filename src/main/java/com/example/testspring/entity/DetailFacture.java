package com.example.testspring.entity;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class DetailFacture {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // gerer par la base
    private long idDetailFacture;
    private int qte;
    private float prixTotal;
    private int pourcentageRemise;
    private int montantemise;

    @ManyToOne(cascade = CascadeType.PERSIST)
    private Produit produits;

    @ManyToOne(cascade = CascadeType.PERSIST)
    private Facture facture;
}
