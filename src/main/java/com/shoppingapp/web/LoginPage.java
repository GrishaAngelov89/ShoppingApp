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
@At("/login")
@Show("Login.html")
public class LoginPage implements Page{
    private User user = new User();
    private UserRepository userRepository;

    public LoginPage() {
    }

    @Inject
    public LoginPage(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Post
    public Page login(){
        if(userRepository.hasUser(user)){
            return new MenuPage();
        }
        return new LoginPage();
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
