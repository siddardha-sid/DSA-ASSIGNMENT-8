
public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
char[] chars = {'a', 'a', 'b', 'b','b', 'c', 'c', 'c'};
        
        Q5 solution = new Q5();
        int newLength = solution.compress(chars);
        
        System.out.println("New length: " + newLength);
        System.out.print("Modified array: [");
        for (int i = 0; i < newLength; i++) {
            System.out.print("\"" + chars[i] + "\"");
            if (i < newLength - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
	}
	public int compress(char[] chars) {
        int n = chars.length; 
        int index = 0; 
        
      
        for (int i = 0; i < n; i++) {
            char currentChar = chars[i];
            int count = 1; 
            
            while (i + 1 < n && chars[i + 1] == currentChar) {
                count++;
                i++;
            }
            
            
            chars[index] = currentChar;
            index++;         
 
            if (count > 1) {
                String countStr = String.valueOf(count);
            
                for (char c : countStr.toCharArray()) {
                    chars[index] = c;
                    index++;
                }
            }
        }    
        return index;
    }

}
