package com.example.k8sexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class K8sExampleApplication {

	@GetMapping("/message")
	public String displayMessage(){
		return "Deployed to k8s!";
	}


	public static void main(String[] args) {

		SpringApplication.run(K8sExampleApplication.class, args);
	}

}
