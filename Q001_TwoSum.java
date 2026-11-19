import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> indexByValue = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            Integer otherIndex = indexByValue.get(target - nums[i]);
            if (otherIndex != null) {
                return new int[] {otherIndex, i};
            }
            indexByValue.put(nums[i], i);
        }

        throw new IllegalArgumentException("No two values add up to target");
    }
}
