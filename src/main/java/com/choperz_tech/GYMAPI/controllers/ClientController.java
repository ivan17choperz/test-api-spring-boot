package com.choperz_tech.GYMAPI.controllers;

import com.choperz_tech.GYMAPI.dto.ClientDTO;
import com.choperz_tech.GYMAPI.models.Client;
import com.choperz_tech.GYMAPI.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class ClientController {

    @Autowired
    private ClientService clientService;

    @GetMapping("/clients")
    public List<Client> getClients() {
        return clientService.getClients();
    }

    @GetMapping("/client/{id}")
    public Client getDetailClient(@PathVariable Long id) {
        return clientService.getClientById(id);
    }

    @PostMapping("/save-client")
    public Client registerClient(@RequestBody ClientDTO clientDTO) {
        return clientService.registerNewClient(clientDTO);
    }

    @DeleteMapping("/delete-client/{id}")
    public String deleteClient(@PathVariable Long id) {
        return clientService.deleteClient(id);
    }

}
