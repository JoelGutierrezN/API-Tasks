package com.tasks.persistence.services;

import com.tasks.persistence.entities.Comment;
import com.tasks.persistence.repositories.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentService implements ICommentService {

    @Autowired
    private CommentRepository commentRepository;

    @Override
    public List<Comment> findAll() {
        return commentRepository.findAll();
    }

    @Override
    public Comment getComment(Long id) {
        return commentRepository.findById(id).orElse(null);
    }

    @Override
    public Comment createComment(Comment comment) {
        return commentRepository.save(comment);
    }

    @Override
    public Comment updateComment(Comment comment, Long id) {
        Comment commentDB = commentRepository.findById(id).orElse(null);

        if(commentDB != null){
            commentDB.setTitle(comment.getTitle());
            commentDB.setContent(comment.getContent());
            commentRepository.save(commentDB);
            return commentDB;
        }
        return comment;
    }

    @Override
    public boolean deleteComment(Long id) {
        Comment comment = commentRepository.findById(id).orElse(null);
        if(comment != null) {
            commentRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
