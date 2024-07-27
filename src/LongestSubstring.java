/*
 Example 1:

Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.
Example 2:

Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.
Example 3:

Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.*/
import java.util.HashMap;
import java.util.Map;
public class LongestSubstring {
	public int lengthOfLongestSubstring(String s) {
		int maxLength = 0;
		
		//-->BruteForce O(n^2)
		
//		for (int i = 0; i < s.length(); i++) {
//			StringBuilder stringBuilder = new StringBuilder();
//			for (int j = i; j < s.length(); j++) {
//				if(stringBuilder.indexOf(String.valueOf(s.charAt(j)))!=-1) {
//					break;
//				}
//				stringBuilder .append(s.charAt(j));
////				if(stringBuilder.length()>maxLength) {
////					maxLength=stringBuilder.length();
////				}
//				maxLength = Math.max(maxLength, stringBuilder.length());
//				
//				
//			}
//		}
		
		//-->Sliding window for O(n)
		//Left only when we find repeating of substring 

		Map<Character, Integer> visited = new HashMap<>();
		for (int right = 0, left = 0; right < s.length(); right++) {
			
			if(visited.containsKey(s.charAt(right))&&visited.get(s.charAt(right))>=left){
				
				left = visited.get(s.charAt(right))+1;
			}
			
			maxLength = Math.max(maxLength, right-left+1 );
			visited.put(s.charAt(right), right);
		}
		return maxLength;
	}
	
	public static void main(String[] args) {
		String string = "abcabcbb";
		LongestSubstring longestSubstring = new LongestSubstring();
		System.out.println(longestSubstring.lengthOfLongestSubstring(string));
	}
}
