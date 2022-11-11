package com.tasks.persistence.services;

import com.tasks.persistence.entities.Team;
import com.tasks.persistence.repositories.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeamService implements ITeamService{

    @Autowired
    private TeamRepository teamRepository;

    @Override
    public List<Team> findAll() {
        return teamRepository.findAll();
    }

    @Override
    public Team getTeam(Long id) {
        return teamRepository.findById(id).orElse(null);
    }

    @Override
    public Team createTeam(Team team) {
        return teamRepository.save(team);
    }

    @Override
    public Team updateTeam(Team team, Long id) {

        Team teamDB = teamRepository.findById(id).orElse(null);

        if(teamDB != null){
            teamDB.setName(team.getName());
            teamDB.setTeamColor(team.getTeamColor());
            teamDB.setTeamImage(team.getTeamImage());
            teamRepository.save(teamDB);
            return teamDB;
        }
        return team;

    }

    @Override
    public boolean deleteTeam(Long id) {
        Team team = teamRepository.findById(id).orElse(null);
        if(team != null) {
            teamRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
