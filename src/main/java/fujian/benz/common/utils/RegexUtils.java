package fujian.benz.common.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.lang3.StringUtils;

public final class RegexUtils {
        
	/**
	 * 正则判断是否数字（包含正负，整数，小数）是返回true，不是返回false
	 * 
	 * @param str
	 *            输入字符串
	 *
	 * @return true或false 
	 */
	public static boolean checkNumber(String str){  
		
		String reg="^(-?\\d+)(\\.\\d+)?$";
	             
		if(StringUtils.isBlank(str)){
	            return false;           	
	            
		}
		
		Pattern pattern=Pattern.compile(reg);
		
		return pattern.matcher(str).matches();
	}
	
	/**
	 * 正则判断是否包含中文 可单独一个字符判断 是返回true，不是返回false
	 * 
	 * @param str
	 *            输入字符串
	 *
	 * @return true或false 
	 */
	public static boolean isChinese(String str) {
		String regEx = "[\u4e00-\u9fa5]";
		Pattern pat = Pattern.compile(regEx);
		Matcher matcher = pat.matcher(str);
		boolean flg = false;
		if (matcher.find())
			flg = true;

		return flg;
	}
}
