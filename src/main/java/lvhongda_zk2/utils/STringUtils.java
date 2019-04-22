package lvhongda_zk2.utils;
/**
 *创建 
 * 字符串工具类
 * 
 */
public class STringUtils {
	
	
	
	//方法1：判断源字符串是否有值，空引号(空白字符串)也算没值 (5分)
	public static boolean hasLength(String src){
	    //实现代码
		//char[] ch = src.toCharArray();
		if (src.length()>0) {
			System.out.println("有值");
			return true;
		}
		if (!src.contains("")) {
			System.out.println("有值");
			return true;
		}
		if (src.contains("")) {
			System.out.println("没值");
			return false;
		}
		if (src.contains(null)) {
			System.out.println("没值");
			return false;
		}
		if (!src.contains(null)) {
			System.out.println("有值");
			return true;
		}
		if (src.length()==0) {
			System.out.println("没值");
			return false;
		}
		if (src.length()!=0) {
			System.out.println("有值");
			return true;
		}
		if (src.contains(" ")) {
			System.out.println("没值");
			return false;
		}
		if (!src.contains(" ")) {
			System.out.println("有值");
			return true;
		}
		System.out.println("有值");
		return true;
		
	}
	//方法2：判断源字符串是否有值，空引号(空白字符串)和空格也算没值 (5分)
	public static boolean hasText(String src){
	    //实现代码
		if (src.contains("")) {
			System.out.println("没有值");
			return false;
		}
		if (src.contains(null)) {
			System.out.println("没有值");
			return false;
		}
		if (src.length()==0) {
			System.out.println("没有值");
			return false;
		}
		if (src.contains(" ")) {
			System.out.println("没有值");
			return false;
		}
		System.out.println("有值");
		return true;
	}
	//方法3：判断是否为手机号码 (5分)
	public static boolean isMobile(String src){
	    //实现代码
		if (src.length()==11) {
			System.out.println("是手机号");
			return true;
		}else {
			System.out.println("不是手机号");
			return false;
		}
		
	}
	//方法4：判断是否为邮箱 (5分)
	public static boolean isEmail(String src){
	    //实现代码
		if (src.contains("@")&&src.contains(".")) {
			System.out.println("是邮箱");
			return true;
		}
		System.out.println("不是邮箱");
		return false;
	}
	//方法5：反转字符串，例如参数值是“abcdefg”，则输出“gfedcba” (5分)
	public static String reverse(String src){
	    //实现代码
		//System.out.println("请输入6位字符串");
		char[] ch = src.toCharArray();
		if (ch.length>0) {
			StringBuilder result=new StringBuilder();
			String str="";
			for (int i = 5; i>=0; i--) {
					result.append(ch[i]);
					str = result.toString();
			}
			System.out.println(str);
			return str;
		}
		System.out.println("无效");
		return "无效";
	}

}
