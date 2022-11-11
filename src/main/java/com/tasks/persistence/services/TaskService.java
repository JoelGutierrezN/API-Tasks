package com.tasks.persistence.services;

import com.tasks.persistence.entities.Task;
import com.tasks.persistence.repositories.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService implements ITaskService{

    @Autowired
    private TaskRepository taskRepository;

    @Override
    public List<Task> findAll() {
        return taskRepository.findAll();
    }

    @Override
    public Task getTask(Long id) {
        return taskRepository.findById(id).orElse(null);
    }

    @Override
    public Task createTask(Task task) {
        return taskRepository.save(task);
    }

    @Override
    public Task updateTask(Task task, Long id) {
        Task taskDB = taskRepository.findById(id).orElse(null);

        if(taskDB != null){
            taskDB.setTitle(task.getTitle());
            taskDB.setDescription(task.getDescription());
            taskRepository.save(taskDB);
            return taskDB;
        }
        return task;
    }

    @Override
    public boolean deleteTask(Long id) {
        Task task = taskRepository.findById(id).orElse(null);
        if(task != null) {
            taskRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
