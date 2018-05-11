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
@RequestMapping("/contracts")
public class ContractController {

    private static List<Contract> contracts = new ArrayList<>();

    @GetMapping
    public String getAllContracts(Model model){
        model.addAttribute("contracts", contracts);
        return "contracts_index";
    }
}
