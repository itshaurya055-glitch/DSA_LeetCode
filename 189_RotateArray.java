// 1. Reverse whole array
// 2. Reverse first k elements
// 3. Reverse last n-k elements
class Solution{
    public void rotate(int[] nums, int K ){
        int n = nums.length;
        int k = K%n; // In case k>n 
        reverse(nums, 0,n-1);
        reverse(nums,0,k-1);
        reverse(nums,k,n-1);
    }
    public void reverse(int[] nums, int start , int end){
        while(start < end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
    
}