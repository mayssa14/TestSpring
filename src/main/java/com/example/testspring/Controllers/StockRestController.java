package com.example.testspring.Controllers;

import com.example.testspring.entity.Produit;
import com.example.testspring.entity.Stock;
import com.example.testspring.service.IStockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("stock")
public class StockRestController {

    @Autowired
    IStockService iStockService;


    @GetMapping("/getAll")
    public List<Stock> retrieveAllStocks()
    {
        return iStockService.retrieveAllStocks();
    }

    @PostMapping("/addE") //http://localhost:8080/etudiant/add
    public Stock addStock (@RequestBody Stock s)
    {
        return  iStockService.addStock(s);
    }

    @GetMapping("/getOne/{idD}")
    public Stock retrieveStock(@PathVariable(value = "idD") long idStock)
    {
        return iStockService.retrieveStock(idStock);
    }





}
