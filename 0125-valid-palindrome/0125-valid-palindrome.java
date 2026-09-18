class Solution {
    public boolean isPalindrome(String s) {
      int left = 0;
      int right = s.length() -1;
      while(left <= right){
        char leftchar = Character.toLowerCase(s.charAt(left));
        char rightchar = Character.toLowerCase(s.charAt(right));

        if(!Character.isLetterOrDigit(rightchar)){
            right--;
        }else if (!Character.isLetterOrDigit(leftchar)){
            left++;
        }else if (rightchar != leftchar){
            return false;
        }else{
            right--;
            left++;
        }
      }
      return true;
    }
}