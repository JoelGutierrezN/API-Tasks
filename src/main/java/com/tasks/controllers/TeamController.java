package com.tasks.controllers;

import com.tasks.persistence.entities.Team;
import com.tasks.persistence.entities.User;
import com.tasks.persistence.services.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/teams")
public class TeamController {

    @Autowired
    private TeamService teamService;

    @GetMapping()
    public List<Team> index(){
        return teamService.findAll();
    }

    @GetMapping("/{id}")
    public Team show(@PathVariable(value = "id") Long id){
        return teamService.getTeam(id);
    }

    @PostMapping()
    public Team create(@RequestBody Team team){
        return teamService.createTeam(team);
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> update(@RequestBody Team team, @PathVariable(value = "id") Long id){
        return new ResponseEntity<>(teamService.updateTeam(team, id), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> update(@PathVariable(value = "id") Long id){
        if(teamService.deleteTeam(id)){
            return new ResponseEntity<>(null, HttpStatus.ACCEPTED);
        }else{
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
        }
    }

}
