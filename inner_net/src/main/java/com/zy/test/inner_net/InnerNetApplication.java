package com.zy.test.inner_net;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class InnerNetApplication {

	public static void main(String[] args) {
		SpringApplication.run(InnerNetApplication.class, args);
	}

}
