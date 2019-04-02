package com.promo.grammarrules.port;

import com.promo.grammarrules.models.GrammarRule;
import org.springframework.data.repository.CrudRepository;

public interface GrammarRuleRepository extends CrudRepository<GrammarRule, String> {
}
