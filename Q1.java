import java.util.HashMap;
import java.util.Map;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Given two strings s1 and s2, return *the lowest **ASCII** sum of deleted characters to make two strings equal*.
				//**Example 1:**
				//**Input:** s1 = "sea", s2 = "eat"
				///**Output:** 231
				//**Explanation:** Deleting "s" from "sea" adds the ASCII value of "s" (115) to the sum.
				//Deleting "t" from "eat" adds 116 to the sum.
				//At the end, both strings are equal, and 115 + 116 = 231 is the minimum sum possible to achieve this.
		System.out.println((int)'a');
		System.out.println(findSum("sea","eat"));
	}
	public static int findSum(String s1,String s2) {
		Map<Character,Integer> m=new HashMap<>();
		for(int i=0;i<s1.length();i++) {
			if(m.containsKey(s1.charAt(i))) {
				m.put(s1.charAt(i), m.getOrDefault(s1.charAt(i), 0)+1);
			}else {
				m.put(s1.charAt(i), 1);
			}
		}
		for(int i=0;i<s2.length();i++) {
			if(m.containsKey(s2.charAt(i))) {
				m.put(s2.charAt(i), m.getOrDefault(s2.charAt(i), 0)-1);
			}else {
				m.put(s2.charAt(i), 1);
			}
		}
		int temp=0;
		for (Map.Entry<Character, Integer> entry : m.entrySet()) {
		    char key = entry.getKey();
		    int value = entry.getValue();
		   if(value==1) {
			   temp=temp+(int)entry.getKey();
		   }
		    
		}
		return temp;
		
	}

}
