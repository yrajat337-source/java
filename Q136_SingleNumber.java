class Solution {
    public int singleNumber(int[] nums) {
        int unique = 0;
        for (int number : nums) {
            unique ^= number;
        }
        return unique;
    }
}
