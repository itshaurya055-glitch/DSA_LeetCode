// nums = [3,2,2,3]; k = 3;
// output = 2; nums= [2,2,-,-]
class Solution{
    public int removeElement(int[] nums, int val){
        int n = nums.length;
        int k = 0; // pointer for the next position to place non-val element
        for(int i = 0; i < n ; i++){
            if(nums[i] != val){
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
}