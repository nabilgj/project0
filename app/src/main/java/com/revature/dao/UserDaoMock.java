package com.revature.dao;

import com.revature.models.User;
import java.util.Map;

// imported inside Driver
public class UserDaoMock implements IUserDao {

    // from MockDB
    Map<String, User> db = MockUserDB.getInstance().getDB();

    @Override
    public User createUser(User u) {
        // store user in the db
        db.put(u.getUsername(), u);
        return u;
    }

    @Override
    public User getUserByUsername(String username) {
        return db.get(username);
    }
}
