package com.khatabook.khatabook.dto.response;

import com.khatabook.khatabook.Model.User;
import com.khatabook.khatabook.responsestatus.UserResponseStatus;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Component
@Getter
@Setter
public class UserResponseDto {

    User user ;
    UserResponseStatus userResponseStatus;




}
