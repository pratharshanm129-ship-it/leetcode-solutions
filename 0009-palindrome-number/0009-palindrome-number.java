class Solution {
    public boolean isPalindrome(int x) {
        if (x<0){
            return(false);
        }
        int a = x;
        int pal=0;
        while(x!=0){
            int temp = x%10;
            pal = pal*10+temp;
            x=x/10;  
        }
        return(a==pal);
    }
}