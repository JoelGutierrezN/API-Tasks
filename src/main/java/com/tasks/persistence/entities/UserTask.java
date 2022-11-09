package com.tasks.persistence.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
@Table(name = "users_tasks")
public class UserTask {

    @EmbeddedId
    private  UserTaskPK id;

    @ManyToOne
    @JoinColumn(name = "user_id", insertable = false, updatable = false)
    private User user;

    @ManyToOne
    @JoinColumn(name = "task_id", insertable = false, updatable = false)
    @JsonIgnore
    private Task task;

    public UserTaskPK getId() {
        return id;
    }

    public void setId(UserTaskPK id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Task getTask() {
        return task;
    }

    public void setTask(Task task) {
        this.task = task;
    }
}
