/*
 * 将59.175.137.252|[23/Feb/2016:11:09:32 +0800]|hd.gyyx.cn|POST /industry/Login.aspx HTTP/1.0|803
 * 	客户端地址:59.175.137.252
 * 	服务器时间:[23/Feb/2016:11:09:32 +0800]
 * 	域名:hd.gyyx.cn
 * 	请求方式 请求地址与参数:POST /industry/Login.aspx HTTP/1.0
 *  请求的长度 :803
 * 数据分割开来获取其信息
	 * 域名
	 * 服务器时间：小时+分钟+日+月+年
 * */
package day7;

import java.util.Collection;
import java.util.Iterator;
import java.util.ArrayList;

public class TestGuangYu1 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Collection coll = new ArrayList();
		coll.add("59.175.137.252|[23/Feb/2016:11:09:32 +0800]|hd.gyyx.cn|POST /industry/Login.aspx HTTP/1.0|803");
		Iterator i = coll.iterator();
		if(i.hasNext()) {
			String str = (String)i.next();
			// 域名:sArr1[0]
			String[] sArr1 = str.split("[|]");
			// 小时+分钟+日+月+年
			sArr1[1] = sArr1[1].replace("[", "");
			sArr1[1] = sArr1[1].replace("]", "");
			String[] sArr2 = sArr1[1].split("[/ :]");
			int day = Integer.parseInt(sArr2[0]);
			int year = Integer.parseInt(sArr2[2]);
			int hour = Integer.parseInt(sArr2[3]); 
			int minute = Integer.parseInt(sArr2[4]); 
			int second = Integer.parseInt(sArr2[5]); 
			/*
			 * 将获取的信息存入数据库中（现在还不太会）
			 * 然后设计前端页面显示（HTML+CSS+js设计不会）
			 * 之后写前端显示的信息
			 * */ 
			
			/* 每分钟PV的域名排名（从大到小）
			 * 月+日+时+分相同时，计算不重复所有域名的总量count1+所有域名的总量count2
			 * */ 
			
			/*当前分钟PV量与七天前的同一分钟PV量的对比
			 * 计算该日减7之后是否为<=0,如果不小，月+日+时+分 VS 月+（日-7）+时+分,时，域名总量count2比较
			 * 					如果小，月+日+时+分VS（月-1）+（月-1的月下的最大日—（7-日））日，域名总量count2比较
			 * */ 
			
			/* 产品需要支持分域名查看最近一小时每分钟PV访问曲线图
			 * 月+日+时相同时,不同分下count2的比较
			 * */
			
		}

	}


}
