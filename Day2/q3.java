class Solution {
    public int maxArea(int[] height) {
        int i = 0;
        int j = height.length - 1;
        int ans = 0;
        while (i < j) {
            int left = height[i];
            int right = height[j];
            int area = Math.min(left, right) * (j - i);
            ans = Math.max(area, ans);
            if (left < right) {
                i++;
            } else {
                j--;
            }

        }
        return ans;

    }
}