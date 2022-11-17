package com.example.testspring.Controllers;

import com.example.testspring.entity.Facture;
import com.example.testspring.service.IFactureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("facture")
public class FactureRestController {

    @Autowired
    IFactureService iFactureService;

    @GetMapping("/getAll")
    public List<Facture> retrieveAllFactures()
    {
        return iFactureService.retrieveAllFactures();
    }

    @GetMapping("/getOne/{idE}")
    public Facture retrieveFacture(@PathVariable(value = "idE") long idFacture)
    {
        return iFactureService.retrieveFacture(idFacture);
    }


    @DeleteMapping("/delete/{idF}")
    public void removeFacture(@PathVariable(value = "idF") long idFacture)
    {
        iFactureService.cancelFacture( idFacture);
    }


}
