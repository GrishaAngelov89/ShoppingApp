package com.shoppingapp.web;
import com.google.sitebricks.At;

import com.google.sitebricks.Show;
import com.google.sitebricks.http.Post;
import com.shoppingapp.User;
import com.shoppingapp.UserRepository;
import com.google.inject.Inject;

/**
 * @author Grisha Angelov
 */
@At("/register")
@Show("Register.html")
public class RegisterPage implements Page{
    private User user = new User();
    private UserRepository userRepository;

    public RegisterPage() {
    }

    @Inject
    public RegisterPage(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Post
    public Page register(){
        if(!userRepository.hasUser(user)){
            userRepository.save(user);
            return new LoginPage();
        }
        return new RegisterPage();
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
