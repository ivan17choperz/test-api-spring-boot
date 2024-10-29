package com.choperz_tech.GYMAPI.controllers;

import com.choperz_tech.GYMAPI.dto.ClientDTO;
import com.choperz_tech.GYMAPI.dto.MembershipDTO;
import com.choperz_tech.GYMAPI.models.Client;
import com.choperz_tech.GYMAPI.models.Membership;
import com.choperz_tech.GYMAPI.services.ClientService;
import com.choperz_tech.GYMAPI.services.MembershipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ClientController {

    @Autowired
    private ClientService clientService;
    @Autowired
    private MembershipService membershipService;

    @GetMapping("/clients")
    public List<Client> getClients() {
        return clientService.getClients();
    }

    @PostMapping("/clients")
    public Client registerClient(@RequestBody ClientDTO clientDTO) {
        return clientService.registerNewClient(clientDTO);
    }

    @PostMapping("/membership")
    public Membership createMembership(@RequestBody MembershipDTO membershipDTO) {

    return membershipService.registerMembership(membershipDTO);
    }
}
