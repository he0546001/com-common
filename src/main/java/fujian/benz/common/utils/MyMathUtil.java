package fujian.benz.common.utils;

import java.math.BigDecimal;
/**
 * 数字处理工具类
 */
public final class MyMathUtil {
	/**
	 * @param double
	 *            需要保留两位小数的数字
	 * @return 两位小数的数字
	 */
	public static double keepTwoDecimal(double param){//传入参数是double
		BigDecimal bd = new BigDecimal(param);
		double result = bd.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
		return result;
	}
	
	/**
	 * @param String
	 *            需要保留两位小数的数字
	 * @return 两位小数的数字
	 */
	public static double keepTwoDecimals(String param){//传入参数是String 
		BigDecimal bd = new BigDecimal(param);
		double result = bd.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
		return result;
	}
}
