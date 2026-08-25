class Solution {
    public int subtractProductAndSum(int n) {
        int t =n;
        int p=1;
        int s=0;
        int d=0;
        while(t!=0){
            d=t%10;
            s+=d;
            p*=d;
            t/=10;
        }
        return p-s;
    }
}