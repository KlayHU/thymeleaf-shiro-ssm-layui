package com.klay.service.lmpl;

import com.klay.Bean.Permission;
import com.klay.Dao.PermissionMapper;
import com.klay.service.PermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PermissionServicelmpl implements PermissionService {

    @Autowired
    private PermissionMapper permissionMapper;

    @Override
    public String addPerms(Permission permission){
        return permissionMapper.appPerms(permission);
    }

    @Override
    public List<Permission> getPerms(){
        return permissionMapper.getPerms();
    }
}
