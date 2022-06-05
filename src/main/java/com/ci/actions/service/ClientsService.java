package com.ci.actions.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ClientsService {

    public List<String> getAllClients(){
        List<String> clients = new ArrayList<>();
        String client1= "Marcos";
        String client2= "Joao";


        clients.add(client1);
        clients.add(client2);
        return clients;
    }
}
