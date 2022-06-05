package com.ci.actions.resources;

import com.ci.actions.service.ClientsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "clients")
public class ClientsResource {

    @Autowired
    private ClientsService clientsService;

    @GetMapping
    private ResponseEntity findAllClients(){

        List<String> clients = clientsService.getAllClients();

        return ResponseEntity.ok().body(clients);
    }
}
