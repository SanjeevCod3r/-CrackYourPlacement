class Solution {
    public int maxScore(int[] arr, int k) {
        int sum  = 0;
        for(int i=0;i<k;i++){
            sum+=arr[i];
        }
        int res = sum;
        int left = k-1;
        int right = arr.length-1;
        for(int i=left;i>=0;i--){
            sum-=arr[left--];
            sum+=arr[right--];
            res = Math.max(res, sum);
        }
        return res;
    }
}