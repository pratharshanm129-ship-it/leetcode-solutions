class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int l=nums.length;
        int newar[]=new int[l];
        for(int i=0;i<l;i++){
            int c=0;
            for(int j=0;j<l;j++){
                if(nums[j]<nums[i]){
                    c++;
                }
            }
            newar[i]=c;
        }
        return newar;
    }
}