package lvhongda_zk2.test;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

import lvhongda_zk2.utils.CollectionUtils;
import lvhongda_zk2.utils.STringUtils;
import lvhongda_zk2.utils.WebUtils;

public class ZK2Test {

	public static void main(String[] args) {
		//定义字符串
		String str1="字符串";
		String str2="";
		String str3="15672341938";
		String str4="1234@qq.com";
		String str5="这是一个字符";
		//定义list
		ArrayList<Object> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		//定义set
		HashSet<Object> set = new HashSet<>();
		set.add(1);
		set.add(2);
		set.add(3);
		//定义map
		HashMap<Object, Object> map = new HashMap<>();
		map.put(1, 1);
		map.put(2, 2);
		map.put(3, 3);
		//定义web的测试类信息
		String url="www.baidu.com";
		String cookie="张三";
		HttpServletRequest request = null;
		Cookie cookies = null;
		String defaultValue="";
		String names="李四";
		System.out.println("===================测试String封装类方法================");

		//测试String封装类方法
		System.out.println("第1题："+STringUtils.hasLength(str1));
		System.out.println("第2题"+STringUtils.hasText("第2题："+str2));
		System.out.println("第3题"+STringUtils.isMobile("第3题："+str3));
		System.out.println("第4题"+STringUtils.isEmail("第4题："+str4));
		System.out.println("第5题");STringUtils.reverse(str5);
		System.out.println("===================测试collection封装类方法================");
		//测试collection封装类方法
		System.out.println("CollectionUtils第1题");
		CollectionUtils.notEmpty(list);
		CollectionUtils.notEmpty(set);
		System.out.println("CollectionUtils第2题");
		CollectionUtils.notEmpty(map);
		System.out.println("===================测试Web封装类方法================");
		//测试Web封装类方法
		/*WebUtils.getBoolean(request, url);
		WebUtils.getCookieValue(cookies);
		WebUtils.getInt(request, url);
		WebUtils.getString(request, names, defaultValue);
		WebUtils.getUrl(request);*/
	}
}
