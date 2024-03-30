package com.cursoSpringBoot.curso.services;

import com.cursoSpringBoot.curso.entities.User;
import com.cursoSpringBoot.curso.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService  {
    @Autowired
    private UserRepository repository;

    public List<User> findAll(){
        return repository.findAll();
    }


    public User findbyId(Long id){
        Optional<User> obj  = repository.findById(id);
        return obj.get();
    }

    public User insert(User obj){
     return repository.save(obj);
    }

    public void delete(Long id){
        repository.deleteById(id);
    }



}
