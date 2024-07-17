class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        Set<List<Integer>> ans = new HashSet<>();
        for(int i=0;i<n;i++){
            if(i!=0 && nums[i]==nums[i-1]) continue;
            int j = i+1;
            int k = n-1;
            while(j<k){
                int sum = nums[i] + nums[j] + nums[k];
              if(sum>0){
                k--;
              }
              else if(sum<0){
                j++;
              }
              else{
                List<Integer> anss = Arrays.asList(nums[i], nums[j], nums[k]);
                ans.add(anss);
                j++;
                k--;
              }
            }
        }
        return new ArrayList<>(ans);
    }
}