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
public class Stock {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // gerer par la base
    private long idStock;
    private int qteStock;
    private int qteMin;
    private String libelleStock;

    @OneToOne
    private Produit produit;


}
