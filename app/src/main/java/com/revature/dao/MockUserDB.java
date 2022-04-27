package com.revature.dao;

import java.util.Map;
import java.util.HashMap;

import com.revature.models.User;

// MockUserDB is a Lazy Singleton
// to persist db
public class MockUserDB {

    // we are going to use HashMap as our MockDB
    // the first value is the key and 2nd is the element we store

    private Map<String, User> db;

    // this will be shared around
    private static MockUserDB mockDBInstance = null;

    // no other class call this private constructor except this singleton
    private MockUserDB() {
        db = new HashMap<>();
    }

    // when we get the instance
    public static MockUserDB getInstance(){
        if (mockDBInstance == null) {
            mockDBInstance = new MockUserDB();
            return mockDBInstance;
        } else {
            return mockDBInstance;
        }
    }

    public Map<String, User> getDB() {
        return db;
    }
}
