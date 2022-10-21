package com.tasks.persistence.entity;

import javax.persistence.*;

@Entity
@Table(name = "users_teams")
public class UserTeam {
    @EmbeddedId
    private UserTeamPK id;

    @ManyToOne
    @JoinColumn(name = "user_id", insertable = false, updatable = false)
    private User user;

    @ManyToOne
    @JoinColumn(name = "team_id", insertable = false, updatable = false)
    private Team team;

    public UserTeamPK getId() {
        return id;
    }

    public void setId(UserTeamPK id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }
}
