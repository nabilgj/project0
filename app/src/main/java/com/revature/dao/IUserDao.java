package com.revature.dao;

import com.revature.models.User;

// implemented UserDaoMock
public interface IUserDao {

    User createUser(User u);

    User getUserByUsername(String username);
}
