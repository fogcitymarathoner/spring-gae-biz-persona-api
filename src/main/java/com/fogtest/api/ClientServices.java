package com.fogtest.api;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class ClientServices {
    private static List<Client> clients = new ArrayList<>();

    static {
        for(int i=0;i<10;i++){
            clients.add(new Client(i,
                    "Client " + i,
                    "street1",
                    "street2",
                    "city",
                    i,
                    "zip",
                    new Boolean(false),
                    i,
                    new Boolean(false),
                    new Date(),
                    new Date(),
                    i,
                    new Date()));
        }
    }

    public List<Client> getAllClients(){
        return clients;
    }
}
