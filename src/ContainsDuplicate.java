/*
 Example 1:

Input: nums = [1,2,3,1]
Output: true
Example 2:

Input: nums = [1,2,3,4]
Output: false
Example 3:

Input: nums = [1,1,1,3,3,4,3,2,4,2]
Output: true
*/
import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
	public boolean containsDuplicate(int[] nums) {
        Set<Integer> hashSet = new HashSet<>();
        for(int i = 0; i< nums.length;i++){
            if(hashSet.contains(nums[i]))
                return true;
            hashSet.add(nums[i]);
        }
        return false;
    }
	public static void main(String[] args) {
		ContainsDuplicate containsDuplicate = new ContainsDuplicate();
		int[] nums = {1,1,1,3,3,4,3,2,4,2};
		
		System.out.println(containsDuplicate.containsDuplicate(nums));
	}
}
