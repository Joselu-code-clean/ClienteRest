package com.example.ClienteRest.service;

import java.net.URI;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;


public class CocheService {

	RestTemplate restTemplate = new RestTemplate();
	String urlBase = "http://localhost:8080/";
	String openEndPoint = "open";
	String closeEndPoint = "close";
	String halfOpenEndPoint = "halfopen";
	
	Logger logger = LoggerFactory.getLogger(CocheService.class);

	
	
	public String setToOpen() {
		String fooResourceUrl = urlBase+openEndPoint;
		ResponseEntity<String> response = restTemplate.getForEntity(URI.create(fooResourceUrl), String.class);
		logger.info("Estado ---- " + openEndPoint);
		
		return response.getBody();
	}
	
	public String setToClose() {
		String fooResourceUrl = urlBase+openEndPoint;
		ResponseEntity<String> response = restTemplate.getForEntity(URI.create(fooResourceUrl), String.class);
		logger.info("Estado ---- " + closeEndPoint);

		return response.getBody();
	}
	
	public String setToHalfOpen() {
		String fooResourceUrl = urlBase+openEndPoint;
		ResponseEntity<String> response = restTemplate.getForEntity(URI.create(fooResourceUrl), String.class);
		logger.info("Estado ---- " + halfOpenEndPoint);
		
		return response.getBody();
	}
	
}
