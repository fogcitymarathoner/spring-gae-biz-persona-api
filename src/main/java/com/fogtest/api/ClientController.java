package com.fogtest.api;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/clients")
public class ClientController {

    private static List<Client> clients = new ArrayList<>();

    @GetMapping
    public String getAllClients(Model model){
        model.addAttribute("clients", clients);
        return "clients";
    }
}


