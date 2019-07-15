package com.example.util;

import java.util.regex.Pattern;

public class StringUtils {
	/**
	 *  Object 转 String，防止null值，如果obj = null,那String.valueOf(obj)结果就是null字符串
	 * @param obj
	 * @return
	 */
	public static String object2String(Object obj) {
		return obj==null?null:String.valueOf(obj);
	}
	/**
	 * 去掉前后不可见字符
	 * 
	 * @param source
	 * @return
	 */
	public static String removeNonPrintableCharactersFromStartAndEnd(String source) {
		if (isNullOrEmpty(source))
			return source;
		
		// 先去掉前后空白字符
		source = removeWhitespaceCharactersFromStartAndEnd(source);

		// 再去掉前后不可见字符
		char[] elements = source.toCharArray();
		int start = 0;
		for (; start < elements.length; start++) {
			char element = elements[start];
			if (!Character.isSpaceChar(element) && Character.isDefined(element)) {
				break;
			}
		}

		int end = elements.length - 1;
		for (; end >= start; end--) {
			char element = elements[end];
			if (!Character.isSpaceChar(element) && Character.isDefined(element)) {
				break;
			}
		}

		return source.substring(start, end + 1);
	}
	/**
	 * 去掉前后空白字符
	 * 
	 * @param source
	 * @return
	 */
	public static String removeWhitespaceCharactersFromStartAndEnd(String source) {
		if (isNullOrEmpty(source))
			return source;
		
		source = source.trim();
		char[] elements = source.toCharArray();

		// 去掉前后空白符号
		// \f -> 匹配一个换页
		// \n -> 匹配一个换行符
		// \r -> 匹配一个回车符
		// \t -> 匹配一个制表符
		// \v -> 匹配一个垂直制表符
		int start = 0;
		for (; start < elements.length; start++) {
			char element = elements[start];
			if (!Character.toString(element).matches("\\s+")) {
				break;
			}
		}

		int end = elements.length - 1;
		for (; end >= start; end--) {
			char element = elements[end];
			if (!Character.toString(element).matches("\\s+")) {
				break;
			}
		}

		return source.substring(start, end + 1);
	}
	/**
	 * 判断字符串是否是空值或空字符串
	 * @param source
	 * @return
	 */
	public static boolean isNullOrEmpty(String source) {
		if (source == null)
			return true;

		if (source.trim().isEmpty())
			return true;

		return false;
	}
	/**
	 * 判断字符串是否非空或非空字符串
	 * @param source
	 * @return
	 */
	public static boolean isNotNullNorEmpty(String source) {
		if (source == null)
			return false;

		if (source.trim().isEmpty())
			return false;

		return true;
	}

	/**
	 * 限制数字大小
	 * @param name
	 * @return
	 */
	public static boolean  matchBigdecimal(String name){
		String pattern = "^[0-9]{1,20}([.][0-9]{1,6})?$";
		return  Pattern.compile(pattern).matcher(name).matches();
	}

	/**
	 * 判断是否是数字
	 * @param str 传入参数
	 * @return boolean
	 */
	public static boolean isNumeric(String str) {
    for (int i = 0; i < str.length(); i++){
			System.out.println(str.charAt(i));
			if (!Character.isDigit(str.charAt(i)))
			{
			return false;
			}
			}
			return true;
			}

	/**
	 * 替换字符
	 * @param string 传入数据
	 * @return
	 */
	public  static String replaceAll(String string) {
			return string.replaceAll("'", "_").replaceAll(" ", "_").replaceAll("-", "_")
				.replaceAll("&","_").replaceAll("\\*","_").replaceAll("®","_").replaceAll("の","_");
	}
}
