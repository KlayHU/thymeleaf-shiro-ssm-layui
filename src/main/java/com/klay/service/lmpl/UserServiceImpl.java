package com.klay.service.lmpl;
import org.springframework.stereotype.Service;
import com.klay.Bean.User;
import com.klay.Dao.RoleMapper;
import com.klay.Dao.UserMapper;
import com.klay.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    //注入mapper接口
    @Autowired
    private UserMapper userMapper;
    private RoleMapper roleMapper;

    @Override
    public User findByName(String name){
        return userMapper.findByName(name);
    }

    @Override
    public int addUserMsg(User user){
      return userMapper.addUserMsg(user);
    }

    @Override
    public List<User> getUsers(){return userMapper.getUsers();}
}

