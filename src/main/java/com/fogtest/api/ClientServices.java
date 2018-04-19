package com.fogtest.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class ClientServices {
    private ClientRepository clientRepository;

    @Autowired
    public ClientServices(ClientRepository clientRepository){
        super();
        this.clientRepository = clientRepository;
    }

    public List<Client> getAllClients(){
        List<Client> clients = new ArrayList<>();
        this.clientRepository.findAll().forEach(clients::add);
        return clients;
    }
}