package com.edutec.demoneo4j.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Neo4j {
    private final Neo4jService neo4jService;

    @Autowired
    public Neo4j(Neo4jService neo4jService) {
        this.neo4jService = neo4jService;
    }

    @GetMapping("/checkConnection")
    public String checkConnection() {
        if (neo4jService.isConnected()) {
            return "Connected to Neo4j";
        } else {
            return "Failed to connect to Neo4j";
        }
    }    
    
}