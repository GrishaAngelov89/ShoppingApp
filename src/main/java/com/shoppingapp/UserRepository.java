package com.shoppingapp;

import com.google.sitebricks.At;
import com.google.inject.Inject;

/**
 * @author Grisha Angelov
 */
public class UserRepository {
    private UserDao userDao;
    private User user = new User();

    @Inject
    public UserRepository(UserDao userDao) {
        this.userDao = userDao;
    }

    public void save(User user) {
        userDao.save(user);
    }

    public boolean hasUser(User user) {
        return userDao.hasUser(user);
    }

    public User getUser() {
        return user;
    }
}
