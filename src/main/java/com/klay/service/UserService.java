package com.klay.service;

import com.klay.Bean.User;
import com.klay.Bean.UserDTO;
import com.klay.Util.PageDataResult;

import java.util.List;

public interface UserService {

    User findByName(String name);

    int addUserMsg(User user);

    List<User> getUsers();
}
