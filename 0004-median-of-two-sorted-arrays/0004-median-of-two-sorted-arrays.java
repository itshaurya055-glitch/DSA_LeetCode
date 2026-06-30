class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
       int m = nums1.length;
       int n =  nums2.length;
       int[] nums = new int[m+n];
       int i = 0 ; // index for nums1
       int j = 0 ; // index for nums2
       int k = 0; //index for  new array

       while(k < m+n){
        if(j == n){
            nums[k++] = nums1[i++];
        }else if(i == m){
            nums[k++] = nums2[j++];
        }else if(nums1[i] < nums2[j]){
            nums[k++] = nums1[i++];
        }else{
            nums[k++] = nums2[j++];
        }
       }
       int total = m + n;
       if(total % 2 == 0){
        return ((double) nums[total / 2 - 1] + nums[total / 2]) / 2.0;
       }else{
        return nums[total/2];
       }
    }
}