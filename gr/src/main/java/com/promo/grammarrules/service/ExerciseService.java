package com.promo.grammarrules.service;

import com.promo.grammarrules.models.Excercise;
import com.promo.grammarrules.port.ExcerciseRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ExerciseService  {


    public ExerciseService(ExcerciseRepository excerciseRepository) {
        this.excerciseRepository = excerciseRepository;
    }

    ExcerciseRepository excerciseRepository;



    public List<Excercise> getAll(){
        List<Excercise> excercises= new ArrayList<>();
        this.excerciseRepository.findAll().forEach(excercises::add);
        return  excercises;
    }

    public void save(Excercise excercise){
        System.out.println(excercise);
         this.excerciseRepository.save(excercise);
    }
    public Excercise update(Excercise excercise){
        return this.excerciseRepository.save(excercise);
    }
    public Optional<Excercise> findOne(String id){
        return this.excerciseRepository.findById(id);
    }

    public void delete(String id){
      this.excerciseRepository.deleteById(id);
    }
}
