package com.example.thuctap1.service;

import com.example.thuctap1.model.User;
import com.example.thuctap1.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserImplement implements UserService{
    @Autowired
    private UserRepository userRepository;
    @Override
    public User addUser(User user) {
        if(user != null){
            return userRepository.save(user);
        }
        return null;
    }

    @Override
    public User editUser(long id, User user) {
        if(user!=null){
            User us=userRepository.getById(id);
            if(us!=null){
                us.setName(user.getName());
                us.setAge(user.getAge());
                us.setAddress(user.getAddress());
                return userRepository.save(us);
            }
        }
        return null;
    }

    @Override
    public boolean deleteUser(long id) {
        if(id>=1){
            User us=userRepository.getById(id);
            if(us!=null){
                userRepository.delete(us);
                return true;
            }
        }
        return false;
    }

    @Override
    public List<User> selectUser() {

        return userRepository.findAll();
    }
}
