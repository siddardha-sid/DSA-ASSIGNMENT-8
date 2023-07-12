import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "cbaebabacd";
        String p = "abc";

        Q6 solution = new Q6();
        List<Integer> indices = solution.findAnagrams(s, p);

        System.out.println("Start indices of anagrams: " + indices);
	}
	public List<Integer> findAnagrams(String s, String p) {
        List<Integer> indices = new ArrayList<>();
        if (s.length() < p.length()) {
            return indices;
        }

        Map<Character, Integer> targetFreqMap = new HashMap<>();
        for (char c : p.toCharArray()) {
            targetFreqMap.put(c, targetFreqMap.getOrDefault(c, 0) + 1);
        }

        Map<Character, Integer> windowFreqMap = new HashMap<>();

        int left = 0;
        int right = 0;
        int count = 0; 

        while (right < s.length()) {
            char currentChar = s.charAt(right);

    
            windowFreqMap.put(currentChar, windowFreqMap.getOrDefault(currentChar, 0) + 1);

           
            if (targetFreqMap.containsKey(currentChar) && windowFreqMap.get(currentChar).intValue() <= targetFreqMap.get(currentChar).intValue()) {
                count++;
            }

            
            if (count == p.length()) {
                indices.add(left);
            }

            
            if (right - left + 1 == p.length()) {
                char leftChar = s.charAt(left);

                
                if (targetFreqMap.containsKey(leftChar) && windowFreqMap.get(leftChar).intValue() <= targetFreqMap.get(leftChar).intValue()) {
                    count--;
                }
                windowFreqMap.put(leftChar, windowFreqMap.get(leftChar) - 1);

                
                if (windowFreqMap.get(leftChar) == 0) {
                    windowFreqMap.remove(leftChar);
                }

                left++;
            }

            right++;
        }

        return indices;
    }

}
