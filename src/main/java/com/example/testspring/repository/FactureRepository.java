package com.example.testspring.repository;

import com.example.testspring.entity.Client;
import com.example.testspring.entity.Facture;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FactureRepository extends JpaRepository<Facture,Long> {

    public List<Facture> findbyClientidClient(int idClient);

}
