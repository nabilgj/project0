package com.revature.services;

import com.revature.dao.IUserDao;
import com.revature.models.User;
import com.revature.exceptions.UsernameOrPasswordIncorrectException;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;

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

    public void followUser(User current, String username) {
        // when we follow a user
        // put the user in following list
        // put ourselves in their followers list
        // we need to get the person the actually want to follow
        // an opportunity for exception

        User followie = uDao.getUserByUsername(username);

        // take the person that is logged in and get the list of ppl they are following
        Set<User> following = current.getFollowing();

        // add the user we want to follow to our following list
        following.add(followie);
        current.setFollowing(following);

        // update the person object thats being followed
        Set<User> followers = followie.getFollowers();
        followers.add(current);
        followie.setFollowers(followers);

        uDao.createUser(current);
        uDao.createUser(followie);
    }

    public List<User> getTopUsers() {

        List<User> uList = uDao.getAllUsers();
        Collections.sort(uList);
        return uList;
    }
}
