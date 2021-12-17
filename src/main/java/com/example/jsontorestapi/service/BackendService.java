package com.example.jsontorestapi.service;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.io.InputStream;

@Service
public class BackendService {

    public JsonNode getJsonFromFile() throws IOException {
        InputStream inputStream = getClass().getClassLoader().getResourceAsStream("svar1.json");
        ObjectMapper mapper = new ObjectMapper();
        return mapper.readValue(inputStream,JsonNode.class);
    }
}
