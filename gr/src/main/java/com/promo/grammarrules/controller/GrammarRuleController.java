package com.promo.grammarrules.controller;

import com.promo.grammarrules.models.GrammarRule;

import com.promo.grammarrules.service.GrammarRuleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/gramarrule")
public class GrammarRuleController {

    GrammarRuleService grammarRuleService;

    public GrammarRuleController(GrammarRuleService grammarRuleService) {
        this.grammarRuleService = grammarRuleService;
    }


    @PostMapping
    public GrammarRule save(@RequestBody GrammarRule grammarRule){
        return this.grammarRuleService.save(grammarRule);
    }

    @PutMapping
    public GrammarRule update(GrammarRule grammarRule){
        return grammarRuleService.update(grammarRule);
    }
    @GetMapping
    public List<GrammarRule> getAll(){
        return grammarRuleService.getAll();
    }

    @GetMapping("{id}")
    public Optional<GrammarRule> findOne(@PathVariable String id){
        return grammarRuleService.findOne(id);
    }
}
