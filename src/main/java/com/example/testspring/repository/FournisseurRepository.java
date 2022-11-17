package com.example.testspring.repository;

import com.example.testspring.entity.Facture;
import com.example.testspring.entity.Fournisseur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FournisseurRepository  extends JpaRepository<Fournisseur,Long> {

}
