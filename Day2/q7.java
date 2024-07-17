class Solution {
    public int majorityElement(int[] nums) {
        int count = 1;
        int ele = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[ele]) {
                count++;
            } else {
                count--;
            }
            if (count == 0) {
                ele = i;
                count = 1;
            }
        }
        return nums[ele];
    }
}