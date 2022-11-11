package com.tasks.persistence.services;

import com.tasks.persistence.entities.Task;

import java.util.List;

public interface ITaskService {

    public List<Task> findAll();

    public Task getTask(Long id);

    public Task createTask(Task task);

    public Task updateTask(Task task, Long id);

    public boolean deleteTask(Long id);

}
