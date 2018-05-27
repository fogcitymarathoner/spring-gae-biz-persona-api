package com.fogtest.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


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

    public Optional<Invoice> getById(Long id){
        return this.invoiceRepository.findById(id);
    }

    public List<Invoice> getAllInvoicesOrderByDateAsc(){
        List<Invoice> invoices = new ArrayList<>();
        this.invoiceRepository.findAllByOrderByDateAsc().forEach(invoices::add);
        return invoices;
    }
}