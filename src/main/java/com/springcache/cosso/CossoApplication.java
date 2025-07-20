package com.springcache.cosso;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class CossoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CossoApplication.class, args);
	}

}
