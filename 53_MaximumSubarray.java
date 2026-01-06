class solution{
    public int maxSubArray(int[] nums) {
        int maxSoFar = nums[0];
        int currentsum = nums[0];
        for(int i = 1; i < nums.length; i++){
            if(currentsum < 0){
                currentsum = 0;
            }
            currentsum = currentsum + nums[i];;
            if(currentsum > maxSoFar){
                maxSoFar = currentsum;
            }
        }
        return maxSoFar;
    }
}