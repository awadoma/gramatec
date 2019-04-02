package com.promo.grammarrules.config;


import com.promo.grammarrules.controller.ExcerciseController;

import com.promo.grammarrules.controller.GrammarRuleController;
import com.promo.grammarrules.port.ExcerciseRepository;
import com.promo.grammarrules.port.GrammarRuleRepository;
import com.promo.grammarrules.service.ExerciseService;
import com.promo.grammarrules.service.GrammarRuleService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ControllerConfig {

    @Bean
    public ExcerciseController excerciseController(ExcerciseRepository excerciseRepository){
        return new ExcerciseController(new ExerciseService(excerciseRepository));
    }

    @Bean
    public GrammarRuleController grammarRuleController(GrammarRuleRepository grammarRuleRepository){
        return new GrammarRuleController(new GrammarRuleService(grammarRuleRepository));
    }
}
