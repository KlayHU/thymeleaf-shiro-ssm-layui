package com.klay.service.lmpl;


import com.klay.Bean.Role;
import com.klay.Dao.RoleMapper;
import com.klay.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServicelmpl implements RoleService{

    @Autowired
    private RoleMapper roleMapper;

    @Override
    public int addRole(Role role){
        return roleMapper.addRole(role);
    }

    @Override
    public List<Role> getRoles(){
        return roleMapper.getRoles();
    }
}
