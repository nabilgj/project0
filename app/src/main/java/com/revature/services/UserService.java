package com.revature.services;

import com.revature.dao.IUserDao;
import com.revature.models.User;
import com.revature.exceptions.UsernameOrPasswordIncorrectException;

public class UserService {

    // banking operations will go here


    // use dependency injection
    private IUserDao uDao;

    public UserService(IUserDao uDao) {
        this.uDao = uDao;
    }

    // we also register our user from UserService
    public void registerUser(String first, String last, String username, String userType, String email, String password) {
        // check db if user already exist
        // if not create a new user and save into db

        User register = new User(first, last, username, userType, email, password);

        // after we create the user we want to cal DAO
        // to store the data in db persistance layer


        uDao.createUser(register);
    }

    // used in Driver to login in
    // way to retrieve a user with specific username and password from db
    public User loginUser(String username, String password) throws UsernameOrPasswordIncorrectException {

        User u = uDao.getUserByUsername(username);

        // check if user exists
        if (u == null || !password.equals(u.getPassword())) {
            throw new UsernameOrPasswordIncorrectException();
        } else {
            return u;
        }
    }
}
