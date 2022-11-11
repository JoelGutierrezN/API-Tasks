package com.tasks.controllers;

import com.tasks.persistence.entities.Comment;
import com.tasks.persistence.services.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/comments")
public class CommentController {

    @Autowired
    private CommentService commentService;

    @GetMapping
    public List<Comment> index(){
        return commentService.findAll();
    }

    @GetMapping("/{id}")
    public Comment show(@PathVariable(value = "id") Long id){
        return commentService.getComment(id);
    }

    @PostMapping()
    public Comment create(@RequestBody Comment comment){
        return commentService.createComment(comment);
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> update(@RequestBody Comment comment, @PathVariable(value = "id") Long id){
        return new ResponseEntity<>(commentService.updateComment(comment, id), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> update(@PathVariable(value = "id") Long id){
        if(commentService.deleteComment(id)){
            return new ResponseEntity<>(null, HttpStatus.ACCEPTED);
        }else{
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
        }
    }

}
