package com.example.jawt_demo.service;

import java.util.ArrayList;
import java.util.List;
import com.example.jawt_demo.model.User;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    List<User> usersList=new ArrayList<>();

    public UserService(){
        usersList.add(new User("1", "Anurag", "ranurag3788@gmail.com"));
        usersList.add(new User("2", "Anurag", "ranurag3788@gmail.com"));
        usersList.add(new User("3", "Anurag", "ranurag3788@gmail.com"));
    }
    public List<User> getLIst(){
        return this.usersList;
    }
}
