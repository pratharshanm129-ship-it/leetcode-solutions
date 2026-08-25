class Solution {
    public int[] getConcatenation(int[] nums) {
        int l =nums.length;
        int []newar=new int[2*l];
        for(int i=0;i<2*l;i++){
            if(i<l){
                newar[i]=nums[i];
            }
            else{
                newar[i]=nums[i-l];
            }
        }
        return newar;
    }
}