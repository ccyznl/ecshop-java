package com.znlccy.ecshop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class EcshopApplication {

	@RequestMapping(value = "/")
	@ResponseBody
	public String index() {
		return "Hello World!";
	}

	public static void main(String[] args) {
		SpringApplication.run(EcshopApplication.class, args);
	}
}
