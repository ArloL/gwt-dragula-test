package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@Controller
public class GwtDragulaTestApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(GwtDragulaTestApplication.class, args);
	}

	@RequestMapping("/")
	String index() {
		return "index";
	}

}
