package com.promo.grammarrules.service;

import com.promo.grammarrules.models.GrammarRule;
import com.promo.grammarrules.port.GrammarRuleRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class GrammarRuleService {
    
    
    GrammarRuleRepository grammarRuleRepository;

    public GrammarRuleService(GrammarRuleRepository grammarRuleRepository) {
        this.grammarRuleRepository = grammarRuleRepository;
    }

    public List<GrammarRule> getAll(){
        List<GrammarRule> grammarRules= new ArrayList<>();
        this.grammarRuleRepository.findAll().forEach(grammarRules::add);
        return  grammarRules;
    }
    
    public GrammarRule save(GrammarRule grammarRule){
  
        return this.grammarRuleRepository.save(grammarRule);
    }
    public GrammarRule update(GrammarRule grammarRule){
        return this.grammarRuleRepository.save(grammarRule);
    }
    public Optional<GrammarRule> findOne(String id){
        return this.grammarRuleRepository.findById(id);
    }
    
    public void delete(String id){
      this.grammarRuleRepository.deleteById(id);   
    }
}
