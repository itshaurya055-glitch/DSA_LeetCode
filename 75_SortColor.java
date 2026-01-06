// nums = [2,0,2,1,1,0]
// whhat we want = [0,0,1,1,2,2]
// what we will do is we know we hav three colors 0,1,2 so we will have two pointer left and right
// left will point to the next position of 0 and right will point to the next position of 2
// if we encounter 0 we will swap it with left and increment left
// if we encounter 2 we will swap it with right and decrement right

class Solution{
    public void sortcolor(int[] nums){
        int left = 0;
        int right = nums.length - 1;
        int i = 0;  
        while(i <= right){
            if(nums[i] == 0){
                int temp = nums[left];
                nums[left] = nums[i];
                nums[i] = temp;
                left++;
                i++;
            }else if(nums[i] == 2){
                int temp = nums[right];
                nums[right] = nums[i];
                nums[i] = temp; 
                right--;
            }else{
                i++;
            }
        }
    }
}