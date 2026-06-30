class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character , Integer> seen = new HashMap<>();
        int ret = 0;
        int slow = 0;
        int n  = s.length();
        for(int fast = 0; fast < n ; fast++ ){
            char ch = s.charAt(fast);
            if(seen.containsKey(ch)){
                slow = Math.max(slow , seen.get(ch) + 1);
            }
            seen.put(ch, fast);
            ret = Math.max(ret, fast-slow+1);
        }
        return ret;
    }
}