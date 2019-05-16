package com.klay.Dao;

import com.klay.Bean.Permission;
import java.util.List;

public interface PermissionMapper {

    String appPerms(Permission permission);


    /**
     * 分页查询用户数据
     * @return
     */
    List<Permission> getPerms();


}
