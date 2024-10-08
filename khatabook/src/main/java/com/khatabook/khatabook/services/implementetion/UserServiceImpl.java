package com.khatabook.khatabook.services.implementetion;

import com.khatabook.khatabook.Model.User;
import com.khatabook.khatabook.repository.UserRepository;
import com.khatabook.khatabook.services.interfaces.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;
    @Override
    public User signUp(User user) {

//        User user = new User();
//        user.setName(name);
//        user.setEmail(email);
//        user.setPassword(password);
//        user.setMobileNumber(mobile);

        return userRepository.save(user);
    }

    @Override
    public boolean login(String email, String password) {
        User user = userRepository.findByEmail(email);
        return user.getPassword().equals(password);
    }
}
