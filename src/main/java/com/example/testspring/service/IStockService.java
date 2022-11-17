package com.example.testspring.service;


import com.example.testspring.entity.Stock;

import java.util.List;

public interface IStockService {
    List<Stock> retrieveAllStocks();

    Stock addStock(Stock s);

    Stock retrieveStock(Long id);
}
