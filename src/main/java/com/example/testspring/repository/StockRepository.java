package com.example.testspring.repository;

import com.example.testspring.entity.Client;
import com.example.testspring.entity.Stock;
import org.springframework.data.jpa.repository.JpaRepository;


public interface StockRepository extends JpaRepository<Stock,Long> {
}
