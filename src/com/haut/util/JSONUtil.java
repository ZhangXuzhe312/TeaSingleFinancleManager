package com.haut.util;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import javax.servlet.http.HttpServletResponse;
import com.alibaba.fastjson.JSONObject;
public class JSONUtil {
	/**
	 * 写出JSON
	 * @param msg
	 * @param obj
	 * @return
	 */
	public static String writeJSON(String msg, Object obj, HttpServletResponse response) {
		Map<String, Object> maps = new HashMap<String, Object>();
		maps.put("msg", msg);
		Object object ;
		JSONObject fastJson = new JSONObject();
		if(obj  instanceof String) {//判断是字符串类型
			object=obj;
		}else {
			object = JSONObject.toJSON(obj);
		}
		maps.put("data", object);
		Object JSONObj =  JSONObject.toJSON(maps);//把map转为json
		try {
			response.setCharacterEncoding("UTF-8");
			response.setContentType("application/json;charset=UTF-8");
			response.getWriter().write(JSONObj.toString());
			response.getWriter().close();
		} catch (IOException e) {
			return null;
		}
		return JSONObj.toString();
	}
}
