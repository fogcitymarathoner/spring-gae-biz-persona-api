package com.fogtest.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ClientCheckServices {

    private ClientCheckRepository clientCheckRepository;

    @Autowired
    public ClientCheckServices(ClientCheckRepository clientCheckRepository){
        super();
        this.clientCheckRepository = clientCheckRepository;
    }

    public List<ClientCheck> getAllClientChecks(){
        List<ClientCheck> clientChecks = new ArrayList<>();
        this.clientCheckRepository.findAll().forEach(clientChecks::add);
        return clientChecks;
    }
}
