package lvhongda_zk2.utils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionUtils {

	//方法1：判断List或Set集合是否有元素，对象为空或对象中没有元素都算没值 (5分)
	public static boolean notEmpty(List<?> src){
	    //实现代码
		if (src.isEmpty()) {
			System.out.println("没有元素");
			return false;
		}
		System.out.println("有元素");
		return true;
	}
	public static boolean notEmpty(Set<?> src){
	    //实现代码
		if (src.isEmpty()) {
			System.out.println("没有元素");
			return false;
		}
		System.out.println("有元素");
		return true;
	}
	//方法2：判断Map集合是否有元素，对象为空或对象中没有元素都算没值 (5分)
	public static boolean notEmpty(Map<?, ?> src){
	    //实现代码
		if (src.isEmpty()) {
			System.out.println("没有元素");
			return false;
		}
		System.out.println("有元素");
		return true;
	}
}
