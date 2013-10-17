package com.shoppingapp;

/**
 * @author Grisha Angelov
 */
public interface UserDao {
    void save(User user);
    boolean hasUser(User user);
}
