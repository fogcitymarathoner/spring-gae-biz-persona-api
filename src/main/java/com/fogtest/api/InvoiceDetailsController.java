package com.fogtest.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Controller
@RequestMapping("/invoice/{id}")
public class InvoiceDetailsController {

    private static Optional<Invoice> invoice = Optional.empty();

    private com.fogtest.api.InvoiceServices invoiceServices;

    @Autowired
    public InvoiceDetailsController(com.fogtest.api.InvoiceServices invoiceServices){
        super();
        this.invoiceServices = invoiceServices;
    }

    @GetMapping
    public String getInvoice(@PathVariable Long id, Model model){

        this.invoiceServices.getById(id).ifPresent(o -> model.addAttribute("invoice", o));
        return "invoice";
    }
}
