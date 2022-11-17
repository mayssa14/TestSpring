package com.example.testspring.entity;


import com.fasterxml.jackson.databind.deser.std.DateDeserializers;
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
public class Facture {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // gerer par la base
    private long idFacture;
    private float montantRemise;
    private float montantFacture;
    private Date dateFacture;
    private boolean active;

    @OneToMany(mappedBy = "facture")
    private List<DetailFacture> detailFactures;

    @ManyToOne(cascade = CascadeType.PERSIST)
    private Client client;

}
