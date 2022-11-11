package com.tasks.persistence.services;

import com.tasks.persistence.entities.Team;

import java.util.List;
import java.util.Optional;

public interface ITeamService {
    public List<Team> findAll();

    public Team getTeam(Long id);

    public Team createTeam(Team user);

    public Team updateTeam(Team user, Long id);

    public boolean deleteTeam(Long id);
}
