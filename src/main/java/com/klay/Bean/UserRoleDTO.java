package com.klay.Bean;

public class UserRoleDTO {
	private Integer id;

	private String username;

	private String password;

	private String roleNames;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username == null ? null : username.trim();
	}



	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password == null ? null : password.trim();
	}

	public String getRoleNames() {
		return roleNames;
	}

	public void setRoleNames(String roleNames) {
		this.roleNames = roleNames;
	}

	@Override
	public String toString() {
		return "UserRoleDTO{" +
				"id=" + id +
				", username='" + username + '\'' +
				", password='" + password + '\'' +
				", roleNames='" + roleNames + '\'' +
				'}';
	}
}