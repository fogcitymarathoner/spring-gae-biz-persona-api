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
        invoice = this.invoiceServices.getById(id);
        System.out.println(invoice.toString());
        System.out.println(invoice.getClass());
        System.out.println(invoice);
        invoice.ifPresent(invoice -> {
            model.addAttribute("invoice", invoice);
//            model.addAttribute("date", invoice.getDate());
//            model.addAttribute("po", invoice.getPo());
//            model.addAttribute("employerexpenserate", invoice.getEmployerexpenserate());
//            model.addAttribute("terms", invoice.getTerms());
//            model.addAttribute("timecard", invoice.getTimecard());
//            model.addAttribute("notes", invoice.getNotes());
//            model.addAttribute("period_start", invoice.getPeriod_start());
//            model.addAttribute("period_end", invoice.getPeriod_end());
//            model.addAttribute("posted", invoice.getPosted());
//            model.addAttribute("cleared", invoice.getCleared());
//            model.addAttribute("cleared_date", invoice.getCleared_date());
//            model.addAttribute("prcleared", invoice.getPrcleared());
//            model.addAttribute("timecard_receipt_sent", invoice.getAmount());
//            model.addAttribute("message", invoice.getMessage());
//            model.addAttribute("amount", invoice.getAmount());
//            model.addAttribute("voided", invoice.getVoided());
        });

        return "invoice";
    }
}
