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

public class Rayon {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // gerer par la base
    private Long idRayon;
    private String codeRayon;
    private  String libelleRayon;


    @OneToMany (mappedBy = "rayon")
    private List<Produit> produits;


}
