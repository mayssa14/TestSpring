package com.example.testspring.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.List;


@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // gerer par la base
    private  long idClient;
    private String nom;
    private  String prenom;
    private  Date dateNaissance;
    private  String email;
    private  String password;
    private  CategorieClient categorieClient;
    private Profession profession;



    @OneToMany(mappedBy = "client")
    private List<Facture> factures;

}
