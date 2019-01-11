package com.haut.dao;

import java.sql.ResultSet;

import com.haut.entity.User;

public interface UserDao {
	ResultSet selUser();
	int updateUser(User u);
	int banUser(User u);
	int delUser(User u);
	
}
