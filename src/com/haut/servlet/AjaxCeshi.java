package com.haut.servlet;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.haut.util.JSONUtil;
@WebServlet("/AjaxCeshi")
public class AjaxCeshi extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public AjaxCeshi() {
        super();
    }
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uname = request.getParameter("name");
		if("zhangsan".equals(uname)){
			JSONUtil.writeJSON ("200","用户名已被注册",response);
		}else{
			JSONUtil.writeJSON ("201","用户名可以注册",response);
		}
		
		
	}
}
