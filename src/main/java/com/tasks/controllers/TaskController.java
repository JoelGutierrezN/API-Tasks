package com.tasks.controllers;

import com.tasks.persistence.entities.Task;
import com.tasks.persistence.entities.Team;
import com.tasks.persistence.repositories.TaskRepository;
import com.tasks.persistence.services.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tasks")
public class TaskController {

    @Autowired
    private TaskService taskService;

    @GetMapping
    public List<Task> index(){
        return taskService.findAll();
    }

    @GetMapping("/{id}")
    public Task show(@PathVariable(value = "id") Long id){
        return taskService.getTask(id);
    }

    @PostMapping()
    public Task create(@RequestBody Task task){
        return taskService.createTask(task);
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> update(@RequestBody Task task, @PathVariable(value = "id") Long id){
        return new ResponseEntity<>(taskService.updateTask(task, id), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> update(@PathVariable(value = "id") Long id){
        if(taskService.deleteTask(id)){
            return new ResponseEntity<>(null, HttpStatus.ACCEPTED);
        }else{
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
        }
    }

}
