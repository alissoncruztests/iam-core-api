package com.hrom.jwtteste.service;

import com.hrom.jwtteste.domain.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class UserService {

    public List<User> listUsers(){
        User u1 = new User("Fulano", "Brazil");
        User u2 = new User("Siclano", "Mexico");

        return new ArrayList<>(Arrays.asList(u1, u2));
    }
}
