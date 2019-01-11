package com.haut.entity;

public class User {
	
private int id; //用户编号
private String name;//用户名
private String pass;//用户登录密码
private int flag;//用户权限 管理员/普通教师
private int state;//用户状态 禁用/正常

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getPass() {
	return pass;
}
public void setPass(String pass) {
	this.pass = pass;
}
public int getFlag() {
	return flag;
}
public void setFlag(int flag) {
	this.flag = flag;
}
public int getState() {
	return state;
}
public void setState(int state) {
	this.state = state;
}

public User(int id, String name, String pass, int flag, int state) {
	super();
	this.id = id;
	this.name = name;
	this.pass = pass;
	this.flag = flag;
	this.state = state;
}
public User() {
	super();
	// TODO Auto-generated constructor stub
}

}
