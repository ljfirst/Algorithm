package DataStructure.stringANDline.sequenceANDstring;

/** 
 *@author liujun
 *@date 2018-8-28 下午02:14:14
 *@author—Email liujunfirst@outlook.com
 *@description 将string类型的IP地址转化成int
 *@attention 考虑到int类型的最大长度为32位，在计算的时候会出现问题，因此乘积选用long类型来存储。
 *@version 1.0
 */
public class TransIPtoInt {
	
	//IP转化为int
	public long iPToInt(String ip) {
		
		//正则表达式对IP进行判断
		ip = ip.trim();
		String regular = "^[0-9]{1,3}[.][0-9]{1,3}[.][0-9]{1,3}[.][0-9]{1,3}$";
		if(!ip.matches(regular)){
			//throw new Exception("IP地址有误！");
			return -1;
		}
	
		//注意1：如果用“.”作为分隔的话,必须是如下写法,String.split("\\."),这样才能正确的分隔开,不能用String.split(".");
		//注意2：IP地址检查。
		String[] iparray = ip.split("\\.");
		int hex = 8;
		long ipnum = 0; 
		for (int i = 0; i < iparray.length; i++) {
			if(Integer.parseInt(iparray[i]) > 255){
				//throw new Exception("IP地址超过255");
				return -1;
			}
			long f = Integer.parseInt(iparray[i]);
			//注意：先乘除,确定移位数，再移位
			f = f << (iparray.length - i - 1) * hex;
			ipnum += f;
		}
		return ipnum;
	}

	//int数转IP
	public String intToIP(long ipnum) {
		if(ipnum < 0){
			return new String("");
		}
		String intnum = "";
		int hex = 8; 
		int count = 1;
		for (int j = 3; j > 0; j--) {
			intnum += ipnum / (count << hex * j);
			ipnum %= (count << hex * j);
			intnum += ".";
		}
		return intnum += ipnum;
	}
}
