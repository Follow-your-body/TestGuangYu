/*
 * ��59.175.137.252|[23/Feb/2016:11:09:32 +0800]|hd.gyyx.cn|POST /industry/Login.aspx HTTP/1.0|803
 * 	�ͻ��˵�ַ:59.175.137.252
 * 	������ʱ��:[23/Feb/2016:11:09:32 +0800]
 * 	����:hd.gyyx.cn
 * 	����ʽ �����ַ�����:POST /industry/Login.aspx HTTP/1.0
 *  ����ĳ��� :803
 * ���ݷָ����ȡ����Ϣ
	 * ����
	 * ������ʱ�䣺Сʱ+����+��+��+��
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
			// ����:sArr1[0]
			String[] sArr1 = str.split("[|]");
			// Сʱ+����+��+��+��
			sArr1[1] = sArr1[1].replace("[", "");
			sArr1[1] = sArr1[1].replace("]", "");
			String[] sArr2 = sArr1[1].split("[/ :]");
			int day = Integer.parseInt(sArr2[0]);
			int year = Integer.parseInt(sArr2[2]);
			int hour = Integer.parseInt(sArr2[3]); 
			int minute = Integer.parseInt(sArr2[4]); 
			int second = Integer.parseInt(sArr2[5]); 
			/*
			 * ����ȡ����Ϣ�������ݿ��У����ڻ���̫�ᣩ
			 * Ȼ�����ǰ��ҳ����ʾ��HTML+CSS+js��Ʋ��ᣩ
			 * ֮��дǰ����ʾ����Ϣ
			 * */ 
			
			/* ÿ����PV�������������Ӵ�С��
			 * ��+��+ʱ+����ͬʱ�����㲻�ظ���������������count1+��������������count2
			 * */ 
			
			/*��ǰ����PV��������ǰ��ͬһ����PV���ĶԱ�
			 * ������ռ�7֮���Ƿ�Ϊ<=0,�����С����+��+ʱ+�� VS ��+����-7��+ʱ+��,ʱ����������count2�Ƚ�
			 * 					���С����+��+ʱ+��VS����-1��+����-1�����µ�����ա���7-�գ����գ���������count2�Ƚ�
			 * */ 
			
			/* ��Ʒ��Ҫ֧�ַ������鿴���һСʱÿ����PV��������ͼ
			 * ��+��+ʱ��ͬʱ,��ͬ����count2�ıȽ�
			 * */
			
		}

	}


}
