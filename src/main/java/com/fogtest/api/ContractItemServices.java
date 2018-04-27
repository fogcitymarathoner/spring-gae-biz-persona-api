package com.fogtest.api;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class ContractItemServices {
    private ContractItemRepository ContractItemRepository;

    @Autowired
    public ContractItemServices(ContractItemRepository ContractItemRepository){
        super();
        this.ContractItemRepository = ContractItemRepository;
    }

    public List<ContractItem> getAllContractItems(){
        List<ContractItem> contractitems = new ArrayList<>();
        this.ContractItemRepository.findAll().forEach(contractitems::add);
        return contractitems;
    }
}
