package com.khatabook.khatabook.dto.request;


import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Component
@Getter
@Setter
public class UserSignupRequestDto {
    String name;
    String mobileNumber;
    String email;
    String password;
}
