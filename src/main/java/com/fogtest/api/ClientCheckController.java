package com.fogtest.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/clientschecks")
public class ClientCheckController {

    private com.fogtest.api.ClientCheckServices clientcheckServices;

    @Autowired
    public ClientCheckController(com.fogtest.api.ClientCheckServices clientCheckServices){
        super();
        this.clientcheckServices = clientCheckServices;
    }

    @GetMapping
    public String getAllClientChecks(Model model){
        model.addAttribute("title", "Clients Checks");
        model.addAttribute("clientsChecks", this.clientcheckServices.getAllClientsChecks());
        return "clients_checks_index";
    }
}
