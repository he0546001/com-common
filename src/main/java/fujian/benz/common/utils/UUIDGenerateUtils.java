package fujian.benz.common.utils;

import java.util.UUID;



public final class UUIDGenerateUtils {
      
	public static String generateUUID(){
		String uuid = UUID.randomUUID().toString(); //获取UUID并转化为String对象  
        uuid = uuid.replace("-", "");   
		return uuid;
		} 
    
	public static int generateRom() {  //生成时间随机数
		String tem1 = (System.currentTimeMillis() + "").substring(8);
		String tem2 = (int) (Math.random() * 900 + 100) + "";

		if (tem1.charAt(0) == '0') {
			String rep = (int) (Math.random() * 9 + 1) + "";
			tem1.replaceFirst(rep, "");
		}
		int result = Integer.parseInt(tem1 + tem2);

		return (result);
	}
}
