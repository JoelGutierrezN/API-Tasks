package com.tasks.persistence.repositories;

import com.tasks.persistence.entities.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository  extends JpaRepository<Task, Long> { }
