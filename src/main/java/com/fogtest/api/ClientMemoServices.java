package com.fogtest.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ClientMemoServices {

    private ClientMemoRepository clientMemoRepository;

    @Autowired
    public ClientMemoServices(ClientMemoRepository clientMemoRepository){
        super();
        this.clientMemoRepository = clientMemoRepository;
    }

    public List<ClientMemo> getAllClientMemos(){
        List<ClientMemo> clientMemos = new ArrayList<>();
        this.clientMemoRepository.findAll().forEach(clientMemos::add);
        return clientMemos;
    }
}
