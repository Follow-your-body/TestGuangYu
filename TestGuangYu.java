/*���ַ�����������ظ����Ӵ������Ƕ���*/
/* ���н��
	111222333444�г�ȥ�ظ�Ԫ�أ����µ�Ԫ�ظ���Ϊ��4
	1234567�г�ȥ�ظ�Ԫ�أ����µ�Ԫ�ظ���Ϊ��7
	112345678�г�ȥ�ظ�Ԫ�أ����µ�Ԫ�ظ���Ϊ��8
	12345433212332232�г�ȥ�ظ�Ԫ�أ����µ�Ԫ�ظ���Ϊ��5
*/
package day7;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TestGuangYu {	
	
	public TestGuangYu() {
		super();
	}

	 /*
	  * ���ܣ��ñ����ķ�ʽ��¼���ظ��ַ��ĸ���
	  * ����ֵ��void
	  * ������磺123555�г�ȥ�ظ�Ԫ�أ����µ�Ԫ�ظ���Ϊ��4
	  * */ 
	public void TestStringElemmentCount(String str) {
		Set set = (Set) new HashSet();
		char c = '0';
		for(int i = 0; i < str.length(); i++) {
			c = str.charAt(i); 
			if(!set.contains(c)) {
				set.add(c);
			}
		}
		 System.out.println(str + "�г�ȥ�ظ�Ԫ�أ����µ�Ԫ�ظ���Ϊ��" + set.size());		
	}	

	public static void main(String[] args) {
		TestGuangYu tgy = new TestGuangYu();
		Collection coll = Arrays.asList("111222333444", "1234567", "112345678", "12345433212332232");
		Iterator iterator = coll.iterator();		
		while(iterator.hasNext()){
			tgy.TestStringElemmentCount((String) iterator.next());
		}
	}

}
