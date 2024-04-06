package com.vignesh.iteration3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Iteration3Application {

	public static void main(String[] args) {
	ConfigurableApplicationContext context=	SpringApplication.run(Iteration3Application.class, args);
	
	GameRunner g=context.getBean(GameRunner.class);
	g.Runner();
	}

}
