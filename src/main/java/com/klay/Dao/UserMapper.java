package com.klay.Dao;

import com.klay.Bean.User;
import com.klay.Bean.UserDTO;
import com.klay.Bean.UserRoleDTO;
import org.apache.ibatis.annotations.Param;

import java.util.List;


public interface UserMapper {

      User findByName(String name);


      int addUserMsg(User user);

    /**
     * 分页查询用户数据
     * @return
     */
    List<User> getUsers();


}

