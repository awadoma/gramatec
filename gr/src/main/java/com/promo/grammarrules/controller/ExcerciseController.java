package com.promo.grammarrules.controller;


import com.promo.grammarrules.models.Excercise;

import com.promo.grammarrules.service.ExerciseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/grammar")
public class ExcerciseController {


    ExerciseService exerciseService;

    public ExcerciseController(ExerciseService exerciseService) {
        this.exerciseService = exerciseService;
    }

    @PostMapping
    public void save(@RequestBody Excercise excercise){
        System.out.println(excercise);
         this.exerciseService.save(excercise);
    }

    @PutMapping
    public Excercise update(Excercise excercise){
        return exerciseService.update(excercise);
    }
    @GetMapping
    public List<Excercise> getAll(){
        return exerciseService.getAll();
    }

    @GetMapping("{id}")
    public Optional<Excercise> findOne(@PathVariable String id){
        return exerciseService.findOne(id);
    }
}
