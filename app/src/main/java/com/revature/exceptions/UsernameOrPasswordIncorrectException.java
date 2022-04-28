package com.revature.exceptions;

public class UsernameOrPasswordIncorrectException extends Exception {
    // need atleast 2 constructors
    public UsernameOrPasswordIncorrectException() {
        super("This user input has incorrect username or password");
    }

    public UsernameOrPasswordIncorrectException(String message) {
        super(message);
    }
}
