package com.example.jsontorestapi.controller;

import com.example.jsontorestapi.service.BackendService;
import com.fasterxml.jackson.databind.JsonNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequestMapping("/api")
public class MockController {

    @Autowired
    BackendService backendService;

    @GetMapping("/v1")
    public JsonNode getJsonFromService() throws IOException {
        return backendService.getJsonFromFile();
    }
}
