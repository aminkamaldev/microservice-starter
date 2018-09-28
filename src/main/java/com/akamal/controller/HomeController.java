package com.akamal.controller;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@GetMapping("/home")
	public String home() throws UnknownHostException {
		return "Bienvenue sur le microservice : " + InetAddress.getLocalHost().getHostAddress();
	}
}
