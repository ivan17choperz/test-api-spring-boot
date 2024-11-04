package com.choperz_tech.GYMAPI.services;

import com.choperz_tech.GYMAPI.dto.ClientDTO;
import com.choperz_tech.GYMAPI.models.Client;
import com.choperz_tech.GYMAPI.models.Membership;
import com.choperz_tech.GYMAPI.repositories.ClientRepository;
import com.choperz_tech.GYMAPI.repositories.MembershipRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ClientService {
    @Autowired
    private ClientRepository clientRepository;
    @Autowired
    private MembershipRepository membershipRepository;

    public Client registerNewClient(ClientDTO clientdto) {
        Client client = new Client();
        client.setName(clientdto.getName());
        client.setLast_name(clientdto.getLast_name());
        client.setEmail(clientdto.getEmail());
        client.setPhone(clientdto.getPhone());
        client.setSex(clientdto.getSex());
        client.setBirthday(clientdto.getBirthday());

        Membership membership = membershipRepository.findById(clientdto.getMembershipId()).orElseThrow();
        client.setMembership(membership);

        return clientRepository.save(client);
    }

    public List<Client> getClients() {
        return clientRepository.findAll();
    }

    
}
