/*
 Example 1:

Input: s = "anagram", t = "nagaram"
Output: true

Example 2:
Input: s = "rat", t = "car"
Output: false
*/
import java.util.Arrays;

public class Anagram {
	   public boolean isAnagram(String s, String t) {
	        s = s.toLowerCase();
	        t = t.toLowerCase();

	        char[] first = s.toCharArray();
	        char[] second = t.toCharArray();

	        Arrays.sort(first);
	        Arrays.sort(second);

	        boolean result = Arrays.equals(first, second);

	        if(result==true)
	            return true;
	        
	        return false;
	    }
		public static void main(String[] args) {
			String s = new String("anagram");
			String t = new String("gramana");
			
			Anagram anagram = new Anagram();
			//anagram.isAnagram(s, t);
			
			System.out.println(anagram.isAnagram(s, t));
		}
}
