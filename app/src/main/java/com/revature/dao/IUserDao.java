package com.revature.dao;

import com.revature.models.User;

// implemented by UserDaoMock
// imported in UserService
public interface IUserDao {


    User createUser(User u);

    User getUserByUsername(String username);
}
