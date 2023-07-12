
public class Q8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String s = "ab";
	        String goal = "ba";

	        Q8 solution = new Q8();
	        boolean canSwap = solution.buddyStrings(s, goal);

	        System.out.println("Can swap: " + canSwap);
		
		
	}
	 public boolean buddyStrings(String s, String goal) {
	       
	        if (s.length() != goal.length()) {
	            return false;
	        }

	      
	        if (s.equals(goal)) {
	            
	            int[] count = new int[26];
	            for (char c : s.toCharArray()) {
	                count[c - 'a']++;
	                if (count[c - 'a'] >= 2) {
	                    return true;
	                }
	            }
	            return false;
	        }
	        int firstIndex = -1;
	        int secondIndex = -1;
	        for (int i = 0; i < s.length(); i++) {
	            if (s.charAt(i) != goal.charAt(i)) {
	                if (firstIndex == -1) {
	                    firstIndex = i;
	                } else if (secondIndex == -1) {
	                    secondIndex = i;
	                } else {
	   
	                    return false;
	                }
	            }
	        }
	        return (secondIndex != -1 && s.charAt(firstIndex) == goal.charAt(secondIndex)
	                && s.charAt(secondIndex) == goal.charAt(firstIndex));
	    }

}
