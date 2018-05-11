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
@RequestMapping("/contracts-items")
public class ContractItemController {

    private static List<ContractItem> contractitems = new ArrayList<>();

    @GetMapping
    public String getAllContractItems(Model model){
        model.addAttribute("contractitems", contractitems);
        return "contracts_items_index";
    }
}
