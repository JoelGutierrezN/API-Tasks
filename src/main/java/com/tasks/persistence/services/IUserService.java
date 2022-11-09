package com.tasks.persistence.services;

import com.tasks.persistence.entities.User;

import java.util.List;
import java.util.Optional;

public interface IUserService {

    public List<User> findAll();

    public Optional<User> getUser(Long id);

    public User createUser(User user);

    public User updateUser(User user, Long id);

    public boolean deleteUser(Long id);
}
