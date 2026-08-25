class Solution {
    public int countDigits(int num) {
        int t =num;
        int c=0;
        while(t>0){
            int d = t%10;
            if(num%d==0){
                c++;}
            t/=10;    
        }
        return c;
    }
}