package lvhongda_zk2.utils;

import java.util.Enumeration;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

import org.omg.CORBA.Request;

public class WebUtils {

	//方法1：获取url上的参数，返回字符串值类型，如果没有该参数则返回默认值 (5分)
	public static boolean getString(HttpServletRequest request, String names, String defaultValue){
	    //实现代码
		if (request!=null) {
			String localName = request.getLocalName();
			System.out.println(localName);
			Enumeration parameterNames = request.getParameterNames();
			System.out.println(parameterNames);
			return true;
		}
		return false;
	}
	//方法2：获取url上的参数，返回整数类型，如果没有该参数或该参数不是整形值，则返回默认值 (5分)
	public static int getInt(HttpServletRequest request,String url){
	    //实现代码
		int i = request.getIntHeader(url);
		System.out.println(i);
		return i;
	}
	//方法3：获取url上的参数，返回布尔类型，如果没有该参数或该参数不是布尔类型，则返回false  (5分)
	public static boolean getBoolean(HttpServletRequest request,String url){
	    //实现代码
			boolean i = getBoolean(request, url);
			return i;
	}
	//方法4：获取当前请求地址，注意参数不能丢 (5分)
	public static String getUrl(HttpServletRequest request){
	    //实现代码
		String contextPath = request.getContextPath();
		System.out.println(contextPath);
		return contextPath;
	}
	//方法5：给定一个Cookie名获得取Cookie值 (5分)
	public static String getCookieValue(Cookie cookie){
	    //实现代码
		String value="";
			if (cookie!=null) {
				value = cookie.getValue();
				System.out.println(value);
			}
			return value;
	}

}
