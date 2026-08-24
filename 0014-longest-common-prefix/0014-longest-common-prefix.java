class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        String first = strs[0];
        for(int i = 0; i < first.length(); i++){
            int c1 = first.charAt(i);
            for(int j =1; j < strs.length ; j ++){
                String next = strs[j];
                if(i >= next.length() || c1 != next.charAt(i)){
                    return first.substring(0,i);
                }
            }
        }
        return first;
    }
}