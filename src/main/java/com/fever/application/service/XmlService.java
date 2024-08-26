package com.fever.application.service;

import org.springframework.stereotype.Service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

@Service
public class XmlService {

    private final Path xmlFilePath = Path.of("src/main/resources/xml/events.xml");

    public String readXmlFile() {
        try {
            return Files.readString(xmlFilePath);
        } catch (IOException e) {
            throw new RuntimeException("Error reading XML file", e);
        }
    }
}

