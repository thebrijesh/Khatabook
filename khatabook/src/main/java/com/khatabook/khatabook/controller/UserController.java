package com.khatabook.khatabook.controller;

import com.khatabook.khatabook.Model.Business;
import com.khatabook.khatabook.Model.User;
import com.khatabook.khatabook.dto.request.UserLoginRequestDto;
import com.khatabook.khatabook.dto.request.UserSignupRequestDto;
import com.khatabook.khatabook.dto.response.UserResponseDto;
import com.khatabook.khatabook.responsestatus.UserResponseStatus;
import com.khatabook.khatabook.services.interfaces.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;
    @PostMapping("/signup")
    public UserResponseDto signUp(@RequestBody User user){
         UserResponseDto userResponseDto = new UserResponseDto();
         try{
             User user1 =  userService.signUp(user);
             userResponseDto.setUser(user1);
             userResponseDto.setUserResponseStatus(UserResponseStatus.SUCCESS);
         }catch (Exception e){
             userResponseDto.setUserResponseStatus(UserResponseStatus.FAILURE);
         }
          return userResponseDto;
    }



}
