package com.tasks.persistence.services;

import com.tasks.persistence.entities.User;
import com.tasks.persistence.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService implements IUserService{

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public Optional<User> getUser(Long id) {
        return userRepository.findById(id);
    }

    @Override
    public User createUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public User updateUser(User user, Long id) {

        User userDB = userRepository.findById(id).orElse(null);

        if(userDB != null){
            userDB.setFullname(user.getFullname());
            userDB.setGender(user.getGender());
            userDB.setPassword(user.getPassword());
            userDB.setPhone(user.getPhone());
            userDB.setCellphone(user.getCellphone());
            userDB.setProfilePicture(user.getProfilePicture());
            userDB.setRole(user.getRole());
            userRepository.save(userDB);
            return userDB;
        }
        return user;
    }

    @Override
    public boolean deleteUser(Long id) {
        User userDB = userRepository.findById(id).orElse(null);
        if(userDB != null) {
            userRepository.deleteById(id);
            return true;
        }

        return false;
    }
}
