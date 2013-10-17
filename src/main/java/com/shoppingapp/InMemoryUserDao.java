package com.shoppingapp;

import java.util.ArrayList;
import java.util.List;
/**
 * @author Grisha Angelov
 */
public class InMemoryUserDao implements UserDao{
    private List<User> users = new ArrayList<User>();

    @Override
    public void save(User user) {
        if(!users.contains(user)){
            users.add(user);
        }
    }

    @Override
    public boolean hasUser(User user) {
        for(User u:users){
            if(u.getUsername().equals(user.getUsername()) && u.getPassword().equals(user.getPassword())){
                return true;
            }
        }
        return false;
    }
}
