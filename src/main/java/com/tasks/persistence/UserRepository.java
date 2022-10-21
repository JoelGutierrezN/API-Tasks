package com.tasks.persistence;

import com.tasks.persistence.crud.UserCrudRepository;
import com.tasks.persistence.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class UserRepository {
    private UserCrudRepository userCrudRepository;

    public List<User> getAll(){
        return (List< User>) userCrudRepository.findAll();
    }

    public Optional<User> getUser(long id){
        return userCrudRepository.findById(id);
    }

    public User save(User user){
        return userCrudRepository.save(user);
    }

    public void delete(long id){
        userCrudRepository.deleteById(id);
    }
}
