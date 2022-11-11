package com.tasks.persistence.repositories;

import com.tasks.persistence.entities.Team;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeamRepository extends JpaRepository<Team, Long> {
}
