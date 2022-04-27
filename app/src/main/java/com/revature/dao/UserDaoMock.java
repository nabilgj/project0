package com.revature.dao;

import com.revature.models.User;

public class UserDaoMock implements IUserDao {
    @Override
    public User createUser(User u) {
        return null;
    }

    @Override
    public User getUserByUsername(String username) {
        return null;
    }
}
