package com.haut.dao.daoImpl;

import java.sql.ResultSet;

import com.haut.dao.UserDao;
import com.haut.entity.User;

public class UserDaoImpl implements UserDao{

	
	//重写查看用所有户方法
	@Override
	public ResultSet selUser() {
		// TODO Auto-generated method stub
		return null;
	}
	
	//重写修改用户信息方法
	@Override
	public int updateUser(User u) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	//重写禁用用户账号方法
	@Override
	public int banUser(User u) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	//重写删除用户账号
	@Override
	public int delUser(User u) {
		// TODO Auto-generated method stub
		return 0;
	}

}
