class Solution {
    public int rob(int[] nums) {
        int n=nums.length;

        if(n==1)return nums[0];
        if(n==2)return Math.max(nums[0],nums[1]);

        return Math.max(solve(0,n-2,nums),solve(1,n-1,nums));
    }

    private int solve(int k,int j,int[] nums){
        int a=0;
        int b=0;
        for(int i=k;i<=j;i++){
            int curr=Math.max(b,nums[i]+a);
            a=b;
            b=curr;
        }
        return b;
    }
}
