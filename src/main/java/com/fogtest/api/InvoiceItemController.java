package com.fogtest.api;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;


@Controller
@RequestMapping("/invoices-items")
public class InvoiceItemController {

    private static List<InvoiceItem> invoicesItems = new ArrayList<>();

    @GetMapping
    public String getAllInvoices(Model model){
        model.addAttribute("invoices_items", invoicesItems);
        return "invoices_items_index";
    }
}
