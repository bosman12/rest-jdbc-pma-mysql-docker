package com.example.forsummerpractise.service;

import com.example.forsummerpractise.entity.User;
import com.example.forsummerpractise.repository.UserDAO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;

@Slf4j
@Service
public class UserService {

    UserDAO userDAO = new UserDAO();

    public User getUserById(int id) throws SQLException {
        User user = userDAO.selectUser(id);
        log.info("get by id user: {}", user);
        return user;
    }

    public List<User> getAllUser(){
        List<User> users = userDAO.selectAllUsers();
        log.info("get all users: " );
        return users;
    }

    public void deleteUserById(int id) throws SQLException {
        log.info("user with id {} has been deleted", id);
        userDAO.deleteUser(id);
    }
}
