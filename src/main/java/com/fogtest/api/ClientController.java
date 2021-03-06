package com.fogtest.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/clients")
public class ClientController {

    private com.fogtest.api.ClientServices clientServices;

    @Autowired
    public ClientController(com.fogtest.api.ClientServices clientServices){
        super();
        this.clientServices = clientServices;
    }

    @GetMapping
    public String getAllClients(Model model){
        model.addAttribute("title", "Clients");
        model.addAttribute("clients", this.clientServices.getAllClients());
        return "clients_index";
    }
}


