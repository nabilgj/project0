package com.revature.models;

import com.revature.models.Post;

import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;

public class User implements Comparable<User> {


    private String first;
    private String last;
    private String username;

    private String userType;

    private String email;
    private String password;
    private List<Post> posts;
    private Set<User> followers;
    private Set<User> following;

    public User() {
        posts = new ArrayList<>();
        followers = new HashSet<>();
        following = new HashSet<>();
    }

    public User(String first, String last, String username, String userType, String email, String password) {
        this.first = first;
        this.last = last;
        this.username = username;
        this.userType = userType;
        this.email = email;
        this.password = password;

        this.posts = new ArrayList<>();
        this.followers = new HashSet<>();
        this.following = new HashSet<>();
    }

    public String getFirst() {
        return first;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public String getLast() {
        return last;
    }

    public void setLast(String last) {
        this.last = last;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Post> getPosts() {
        return posts;
    }

    public void setPosts(List<Post> posts) {
        this.posts = posts;
    }

    public Set<User> getFollowers() {
        return followers;
    }

    public void setFollowers(Set<User> followers) {
        this.followers = followers;
    }

    public Set<User> getFollowing() {
        return following;
    }

    public void setFollowing(Set<User> following) {
        this.following = following;
    }

    @Override
    public String toString() {
        return "User{" + "\n\t" +
                " first=" + first + "\n\t" +
                " last=" + last + "\n\t" +
                " username=" + username + "\n\t" +
                " user type=" + userType + "\n\t" +
                " email=" + email + "\n\t" +
                " password=" + password + "\n\t" +
                " posts=" + posts.size() + "\n\t"+
                " followers=" + followers.size() + "\n\t" +
                " following=" + following.size() + "\n" +
                '}';
    }

    @Override
    public int compareTo(User u) {
            if (this.followers.size() > u.followers.size()) {
                return -1;
            } else if (this.followers.size() < u.followers.size()) {
                return 1;
            } else {
                return 0;
            }

    }
}
