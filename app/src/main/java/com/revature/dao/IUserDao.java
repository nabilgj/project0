package com.revature.dao;

import com.revature.models.User;
import java.util.List;

// implemented by UserDaoMock
// imported in UserService
public interface IUserDao {

    // implemented inside UserDaoMock

    User createUser(User u);

    User getUserByUsername(String username);


    List<User> getAllUsers();
}
