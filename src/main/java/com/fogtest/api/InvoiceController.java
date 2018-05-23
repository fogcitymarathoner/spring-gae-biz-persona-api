package com.fogtest.api;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/invoices")
public class InvoiceController {

    private static List<Invoice> invoices = new ArrayList<>();

    private com.fogtest.api.InvoiceServices invoiceServices;

    @Autowired
    public InvoiceController(com.fogtest.api.InvoiceServices invoiceServices){
        super();
        this.invoiceServices = invoiceServices;
    }

    @GetMapping
    public String getAllInvoices(Model model){
        invoices = this.invoiceServices.getAllInvoicesOrderByDateAsc();
        System.out.println(invoices);
        model.addAttribute("invoices", invoices);
        return "invoices_index";
    }
}


