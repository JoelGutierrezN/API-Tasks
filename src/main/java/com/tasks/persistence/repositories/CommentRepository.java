package com.tasks.persistence.repositories;

import com.tasks.persistence.entities.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment, Long> {
}
