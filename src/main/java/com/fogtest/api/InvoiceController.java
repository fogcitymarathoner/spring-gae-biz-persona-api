package com.fogtest.api;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/invoices")
public class InvoiceController {

    private static List<Invoice> invoices = new ArrayList<>();

    @GetMapping
    public String getAllInvoices(Model model){
        model.addAttribute("invoices", invoices);
        return "invoices_index";
    }
}


