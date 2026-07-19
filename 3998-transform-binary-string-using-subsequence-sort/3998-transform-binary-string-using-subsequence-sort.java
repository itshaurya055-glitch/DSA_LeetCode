class Solution {
    public boolean[] transformStr(String s, String[] strs) {
        int n = s.length();
        int[] pref = new int[n];
        int z = 0;
        for(int i = 0; i < n ; i++){
            if(s.charAt(i) == '0') z++;
            pref[i] = z;
        }

        boolean[] ans = new boolean[strs.length];

        for(int k = 0; k < strs.length; k++){
            String t = strs[k];

            int fixed0 = 0; 
            int totalQ = 0;

            for(char c : t.toCharArray()){
                if(c == '0') fixed0++;
                else if(c == '?') totalQ++;
            }
            int need = z- fixed0;

            if(need < 0 || need > totalQ){
                ans[k] = false;
                continue;
            }
            int fixedSeen = 0 ;
            int qSeen = 0;
            boolean ok = true;

            for(int i =0; i < n; i++){
                char c = t.charAt(i);

                if(c == '0') fixedSeen++;
                else if(c == '?') qSeen++;

                // int minZeros = fixedSeen + Math.max(0, need - (totalQ - qSeen));
                int maxZeros = fixedSeen + Math.min(need, qSeen);

                if(maxZeros < pref[i]){
                    ok = false;
                    break;
                }
            }
            ans[k] = ok;
        }
        return ans;
    }
}