package com.microservices.tbalance.response;


import com.microservices.tbalance.model.Users;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class LoginResponse {

    private Users user;

}
