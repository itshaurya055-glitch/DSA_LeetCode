// Approach: Use two passes to calculate the product of all elements to the left and right of each index.
// nums = [1,2,3,4]
// left products = [1,1,2,6] (products of elements to the left)
// right products = [24,12,4,1] (products of elements to the right)
// result = [24,12,8,6] (left products * right products)

class solution{
    public int[] productExceptSelf(int[] nums){

        int n = nums.length;

        int[] left = new int[nums.length];
        int[] right = new int[nums.length];
        int[] result = new int[nums.length];

        left[0] =  1;
        right[n-1] = 1;

        for(int i = 1; i <n; i++){
            left[i] = left[i-1] * nums[i-1];
        }
        for(int i = n-2; i >0; i--){
            right[i] = right[i+1]*nums[i+1];
        }
        for(int i = 0; i < n; i++){
            result[i] = left[i] * right[i];
        }
        return result;

    }
}
