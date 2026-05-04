class Solution {
    public int search(int[] nums, int target) {
        int len = nums.length;
        int l=0, r=len-1, mid=(r+l)/2;

        while(l<=r){
            mid = (r+l)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]>target){
                r = mid-1;
            }
            else{
                l = mid + 1;
            }
        }
        return -1;
    }
}
