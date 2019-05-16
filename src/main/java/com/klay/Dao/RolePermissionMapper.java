package com.klay.Dao;

import com.klay.Bean.RolePermission;

import java.util.List;

public interface RolePermissionMapper {

    List<RolePermission> findByRole(int roleId);

}
