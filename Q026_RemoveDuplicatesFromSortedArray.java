class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int uniqueCount = 1;
        for (int read = 1; read < nums.length; read++) {
            if (nums[read] != nums[uniqueCount - 1]) {
                nums[uniqueCount] = nums[read];
                uniqueCount++;
            }
        }
        return uniqueCount;
    }
}
