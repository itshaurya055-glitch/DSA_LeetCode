// num = [0,1,0,3,12]
// whhat we want = [1,3,12,0,0]
// and what we wiil do is we move all non zero elemnqents to the front and increment the index


class Solution {
    public void moveZeroes(int[] nums){
        int n = nums.length;
        int k = 0 ;
        for(int i = 0 ; i < n ; i++){
            if(nums[i] != 0){
                int temp = nums[i];
                nums[i] = nums[k];
                nums[k] = temp;
                k++;
            }
        }

    }
}
