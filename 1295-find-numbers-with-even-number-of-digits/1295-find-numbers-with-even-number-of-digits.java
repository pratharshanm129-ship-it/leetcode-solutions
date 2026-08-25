class Solution {
    public int findNumbers(int[] nums) {
        int co=0;
        for(int i=0;i<nums.length;i++){
            int a = 0;
            int b = nums[i];
            while(b>0){
                b=b/10;
                a+=1;
            }
            if(a%2==0){
                co+=1;
            }
            
        }
        return co;
    }
}