/*求字符串长度最长不重复的子串长度是多少*/
/* 运行结果
	111222333444中除去重复元素，余下的元素个数为：4
	1234567中除去重复元素，余下的元素个数为：7
	112345678中除去重复元素，余下的元素个数为：8
	12345433212332232中除去重复元素，余下的元素个数为：5
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
	  * 功能：用遍历的方式记录不重复字符的个数
	  * 返回值：void
	  * 输出：如：123555中除去重复元素，余下的元素个数为：4
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
		 System.out.println(str + "中除去重复元素，余下的元素个数为：" + set.size());		
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
