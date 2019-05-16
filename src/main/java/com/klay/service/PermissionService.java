package com.klay.service;

import com.klay.Bean.Permission;

import java.util.List;

public interface PermissionService {

    String addPerms(Permission permission);

    /**
     *分页查询权限信息
     * @
     */
    List<Permission> getPerms();
}
