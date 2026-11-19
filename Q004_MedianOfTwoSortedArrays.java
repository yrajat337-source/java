class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if (nums1.length > nums2.length) {
            int[] temp = nums1;
            nums1 = nums2;
            nums2 = temp;
        }

        int m = nums1.length;
        int n = nums2.length;
        int left = 0;
        int right = m;
        int leftSize = (m + n + 1) / 2;

        while (left <= right) {
            int cut1 = left + (right - left) / 2;
            int cut2 = leftSize - cut1;

            int left1 = cut1 == 0 ? Integer.MIN_VALUE : nums1[cut1 - 1];
            int right1 = cut1 == m ? Integer.MAX_VALUE : nums1[cut1];
            int left2 = cut2 == 0 ? Integer.MIN_VALUE : nums2[cut2 - 1];
            int right2 = cut2 == n ? Integer.MAX_VALUE : nums2[cut2];

            if (left1 <= right2 && left2 <= right1) {
                int lowerMiddle = Math.max(left1, left2);
                if ((m + n) % 2 == 1) {
                    return lowerMiddle;
                }
                int upperMiddle = Math.min(right1, right2);
                return ((long) lowerMiddle + upperMiddle) / 2.0;
            }

            if (left1 > right2) {
                right = cut1 - 1;
            } else {
                left = cut1 + 1;
            }
        }

        throw new IllegalArgumentException("The input arrays must be sorted.");
    }
}
