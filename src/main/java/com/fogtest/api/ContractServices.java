package com.fogtest.api;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class ContractServices {
    private ContractRepository ContractRepository;

    @Autowired
    public ContractServices(ContractRepository ContractRepository){
        super();
        this.ContractRepository = ContractRepository;
    }

    public List<Contract> getAllContracts(){
        List<Contract> contracts = new ArrayList<>();
        this.ContractRepository.findAll().forEach(contracts::add);
        return contracts;
    }
}
