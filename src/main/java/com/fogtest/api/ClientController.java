package com.fogtest.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.Date;

@Controller
@RequestMapping("/clients")
public class ClientController {

    private static List<Client> clients = new ArrayList<>();

    static {
        for(int i=0;i<10;i++){
            clients.add(new Client(i,
                                 "Client " + i,
                    "street1",
                    "street2",
                    "city",
                    i,
                    "zip",
                    new Boolean(false),
                    i,
                    new Boolean(false),
                    new Date(),
                    new Date(),
                    i,
                    new Date()));
        }
    }

    @GetMapping
    public String getAllClients(Model model){
        model.addAttribute("clients", clients);
        return "clients";
    }
}


