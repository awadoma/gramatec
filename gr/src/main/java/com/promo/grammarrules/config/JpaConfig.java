package com.promo.grammarrules.config;


import com.promo.grammarrules.port.ExcerciseRepository;
import com.promo.grammarrules.port.GrammarRuleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JpaConfig {

    @Autowired
    ExcerciseRepository excerciseRepository;
    @Autowired
    GrammarRuleRepository grammarRuleRepository;

    @Bean
    public ExcerciseRepository excerciseRepository(){
        return excerciseRepository;
    }
    @Bean
    public GrammarRuleRepository grammarRuleRepository(){
        return grammarRuleRepository;
    }
}
