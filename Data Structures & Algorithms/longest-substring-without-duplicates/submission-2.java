class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> dup = new HashSet<>();
        int len = s.length();
        int l = 0, r = 0;
        int maxi = 0;
        while(r<len){
            char ch = s.charAt(r);
            if(dup.contains(ch)){
                while(dup.contains(ch)){
                    char lch = s.charAt(l);
                    dup.remove(lch);
                    ++l;
                }
            }
            dup.add(ch);
            maxi = Math.max(maxi, (r-l+1));
            ++r;
        }
        return maxi;
    }
}
