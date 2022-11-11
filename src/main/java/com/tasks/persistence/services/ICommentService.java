package com.tasks.persistence.services;

import com.tasks.persistence.entities.Comment;

import java.util.List;

public interface ICommentService {

    public List<Comment> findAll();

    public Comment getComment(Long id);

    public Comment createComment(Comment comment);

    public Comment updateComment(Comment comment, Long id);

    public boolean deleteComment(Long id);

}
