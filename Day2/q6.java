class Solution {
    public boolean canJump(int[] nums) {
        int position = nums.length - 1;
        for (int idx = nums.length - 2; idx >= 0; idx--) {
            if (idx + nums[idx] >= position) {
                position = idx;
            }
        }
        return position == 0;
    }
}