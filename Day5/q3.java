class Solution {
    public int merge(int nums[], int start, int mid, int end) {
        int temp[] = new int[end - start + 1];
        int left = start;
        int right = mid + 1;
        int index = 0;
        int cnt = 0;

        while (left <= mid && right <= end) {
            if ((long) nums[left] > (long) 2 * nums[right]) {
                cnt += mid - left + 1;
                right++;
            } else {
                left++;
            }
        }

        left = start;
        right = mid + 1;
        while (left <= mid && right <= end) {
            if (nums[left] < nums[right])
                temp[index++] = nums[left++];
            else
                temp[index++] = nums[right++];
        }
        while (left <= mid)
            temp[index++] = nums[left++];
        while (right <= end)
            temp[index++] = nums[right++];
        index = 0;
        while (start <= end)
            nums[start++] = temp[index++];

        return cnt;
    }

    public int mergeSort(int nums[], int start, int end) {
        int count = 0;
        if (start >= end)
            return count;
        int mid = start + (end - start) / 2;
        count += mergeSort(nums, start, mid);
        count += mergeSort(nums, mid + 1, end);
        count += merge(nums, start, mid, end);
        return count;
    }

    public int reversePairs(int[] nums) {
        return mergeSort(nums, 0, nums.length - 1);
    }
}