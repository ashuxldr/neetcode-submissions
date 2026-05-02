class Solution {
    public int[] productExceptSelf(int[] nums) {
        int len = nums.length;
        int[] prefix = new int[len];
        int[] suffix = new int[len];
        Arrays.fill(prefix,1);
        Arrays.fill(suffix,1);

        for(int i=1;i<len;i++){
            prefix[i] = prefix[i-1] * nums[i-1];
        }
        for(int i=len-2;i>=0;i--){
            suffix[i] = suffix[i+1] * nums[i+1];
        }
        for(int i=0;i<len;i++){
            suffix[i] = suffix[i] * prefix[i];
        }
        return suffix;
    }
}  
