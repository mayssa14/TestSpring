package com.example.testspring.Controllers;

import com.example.testspring.entity.Client;
import com.example.testspring.service.IClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("client")
public class ClientRestController {

    @Autowired
    IClientService iClientService;

    @GetMapping("/getAll")
    public List<Client> retrieveAllClient()
    {
        return iClientService.retrieveAllClients();
    }

    @PostMapping("/add") //http://localhost:8080/client/add
    public Client addClient (@RequestBody Client c)
    {
        return  iClientService.addClient(c);
    }

    @PostMapping("/update")
    public Client updateClient(@RequestBody Client c)
    {
        return  iClientService.updateClient(c);
    }

    @GetMapping("/getOne/{idC}")
    public Client retrieveClient(@PathVariable(value = "idC") long idClient)
    {
        return iClientService.retrieveClient(idClient);
    }

    @DeleteMapping("/delete/{idC}")
    public void removeClient(@PathVariable(value = "idC") long idClient)
    {
        iClientService.deleteClient( idClient);
    }

}
