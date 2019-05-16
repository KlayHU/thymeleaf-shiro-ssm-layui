package com.klay.service;

import com.klay.Bean.Role;

import java.util.List;

public interface RoleService {

  int addRole(Role role);

  List<Role> getRoles();
}
