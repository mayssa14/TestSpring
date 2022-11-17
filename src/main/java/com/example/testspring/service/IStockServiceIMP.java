package com.example.testspring.service;

import com.example.testspring.entity.Stock;
import com.example.testspring.repository.StockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IStockServiceIMP implements IStockService{

    @Autowired
    StockRepository stockRepository;

    @Override
    public List<Stock> retrieveAllStocks() {
        return stockRepository.findAll();
    }

    @Override
    public Stock addStock(Stock s) {
        return stockRepository.save(s);
    }



    @Override
    public Stock retrieveStock(Long id) {
        return stockRepository.findById(id).orElse(null) ;
    }
}
