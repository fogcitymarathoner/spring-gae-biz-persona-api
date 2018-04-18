package com.fogtest.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ApiController {

    private com.fogtest.api.ClientServices clientServices;

    @Autowired
    public ApiController(com.fogtest.api.ClientServices clientServices){
        super();
        this.clientServices = clientServices;
    }

    @GetMapping("/clients")
    public List<Client> getAllClients(){
        return this.clientServices.getAllClients();
    }
}
