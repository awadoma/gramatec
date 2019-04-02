package com.promo.grammarrules.port;

import com.promo.grammarrules.models.Excercise;
import org.springframework.data.repository.CrudRepository;

public interface ExcerciseRepository extends CrudRepository<Excercise, String> {
}
