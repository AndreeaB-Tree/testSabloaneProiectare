package com.example.demo;

import java.net.URL;
import java.io.File;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.type.TypeReference;

@SpringBootApplication
public class DemoApplication {

    private ArrayList<Message> messages = new ArrayList<Message>();

	static void readMessages() {

		try {
			ObjectMapper objectMapper = new ObjectMapper();
			objectMapper.readValue(new File("D:\\Programming\\Projects\\springboot-java\\demo\\src\\messages.json"), new TypeReference<ArrayList<Message>>(){});

		}
		catch(Exception e) {
			System.out.println(e);
		}

	}

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		System.out.println("Test");
		readMessages();
	}

	public void printDecodedMessages() {
		for (int i = 0; i < messages.size(); i++) {
		}
	}


	
}
