package com.example.testspring.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;


@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Fournisseur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // gerer par la base
    private long idFournisseur;
    private String codeFournisseur;
    private String libelleFournisseur;

    @ManyToMany(mappedBy = "fournisseurs")
    private List<Produit> produit;


}
