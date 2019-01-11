package com.haut.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/AdminManage")
public class AdminManage extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public AdminManage() {
        super();
        // TODO Auto-generated constructor stub
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {	
		String methods = request.getParameter("methods");
		if("manageUser".equals(methods)){
			//内置框架跳转到用户信息管理界面
			request.getRequestDispatcher("Pages/manageUserinfo.jsp").forward(request, response);
		}else if("manageTea".equals(methods)){
			//内置框架跳转到教师个人信息管理界面
			request.getRequestDispatcher("Pages/manageTeaInfo.jsp").forward(request, response);
		}else if("manageApp".equals(methods)){
			//内置框架跳转到申报管理界面
			request.getRequestDispatcher("Pages/manageApply.jsp").forward(request, response);
		}else{
			request.getRequestDispatcher("Pages/adiminSuc.jsp").forward(request, response);
		}
	}

}
