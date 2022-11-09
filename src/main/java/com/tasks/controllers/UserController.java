package com.tasks.controllers;

import com.tasks.persistence.entities.User;
import com.tasks.persistence.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping()
    public List<User> index(){
        return userService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<User> show(@PathVariable(value = "id") Long id){
        return userService.getUser(id);
    }

    @PostMapping()
    public User create(@RequestBody User user){
        return userService.createUser(user);
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> update(@RequestBody User user, @PathVariable(value = "id") Long id){
        return new ResponseEntity<>(userService.updateUser(user, id), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> update(@PathVariable(value = "id") Long id){
        if(userService.deleteUser(id)){
            return new ResponseEntity<>(null, HttpStatus.ACCEPTED);
        }else{
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
        }


    }
}
