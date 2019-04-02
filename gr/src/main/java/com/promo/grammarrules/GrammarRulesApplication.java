package com.promo.grammarrules;

import com.promo.grammarrules.config.SwaggerConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Controller;

@SpringBootApplication
public class GrammarRulesApplication {

	public static void main(String[] args) {
		SpringApplication.run(GrammarRulesApplication.class, args);
	}

}

