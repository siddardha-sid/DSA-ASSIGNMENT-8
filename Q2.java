import java.util.Stack;

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(check("{}"));
	}
	public static boolean check(String s) {
		Stack<Character> stack=new Stack<>();
		if(s.charAt(0)==')' || s.charAt(0)=='}') return false;
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			if(c=='(' || c=='{' || c=='*') {
				stack.push(c);
			}else {
				if(s.charAt(i)=='}' && stack.pop()=='{') {
					
				}else if(s.charAt(i)==')' && stack.pop()=='(') {
					
				}else {
					return false;
				}
			}
		}
		return true;
	}
	

}
