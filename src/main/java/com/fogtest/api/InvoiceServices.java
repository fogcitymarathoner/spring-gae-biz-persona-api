package com.fogtest.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class InvoiceServices {
    private InvoiceRepository invoiceRepository;

    @Autowired
    public InvoiceServices(InvoiceRepository invoiceRepository){
        super();
        this.invoiceRepository = invoiceRepository;
    }

    public List<Invoice> getAllInvoices(){
        List<Invoice> invoices = new ArrayList<>();
        this.invoiceRepository.findAll().forEach(invoices::add);
        return invoices;
    }
}