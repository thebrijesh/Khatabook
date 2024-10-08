package com.khatabook.khatabook.services.interfaces;

import com.khatabook.khatabook.Model.User;

public interface UserService{

    public User signUp(User user);
    public boolean login(String email , String password);
}
