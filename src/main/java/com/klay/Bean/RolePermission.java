package com.klay.Bean;

public class RolePermission {

    private int RoleId;

    private int PermissionId;

    public int getRoleId() {
        return RoleId;
    }

    public void setRoleId(int roleId) {
        RoleId = roleId;
    }

    public int getPermissionId() {
        return PermissionId;
    }

    public void setPermissionId(int permissionId) {
        PermissionId = permissionId;
    }

    @Override
    public String toString() {
        return "RolePermission{" +
                "RoleId=" + RoleId +
                ", PermissionId=" + PermissionId +
                '}';
    }
}
