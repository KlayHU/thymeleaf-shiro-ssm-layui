package com.klay.Dao;

import com.klay.Bean.Role;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RoleMapper {

   int addRole(Role role);


   /**
    *查找所有角色
    */
   List<Role> getRoles();

   /**
    * 根据用户id获取角色数据
    * @param userId
    * @return
    */
   List<Role> getRoleByUserId(Integer userId);
}
