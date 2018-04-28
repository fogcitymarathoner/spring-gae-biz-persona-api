package com.fogtest.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class InvoiceItemServices {
    private InvoiceItemRepository invoiceItemRepository;

    @Autowired
    public InvoiceItemServices(InvoiceItemRepository invoiceItemRepository){
        super();
        this.invoiceItemRepository = invoiceItemRepository;
    }

    public List<InvoiceItem> getAllInvoicesItems(){
        List<InvoiceItem> invoices_items = new ArrayList<>();
        this.invoiceItemRepository.findAll().forEach(invoices_items::add);
        return invoices_items;
    }
}