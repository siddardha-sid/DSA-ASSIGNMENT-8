import java.util.HashMap;
import java.util.Map;

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
			  temp++;
		   }
		    
		}
		return temp;
}
}
