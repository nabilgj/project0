package com.revature.dao;

import java.util.Map;
import java.util.HashMap;

import com.revature.models.Post;

// this will model an Eager Singleton
public class MockPostDB {
    private Map<String, Post> db;

    private static MockPostDB mockDBInstance = new MockPostDB();

    private MockPostDB() {
        db = new HashMap<String, Post>();
    }

    public static MockPostDB getInstance(){
        return mockDBInstance;
    }

    public Map<String, Post> getDb() {
        return db;
    }
}
