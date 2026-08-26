class Solution {
    public boolean isSubsequence(String s, String t) {
        int n1=s.length();
        int n2=t.length();
        boolean f =false;
        int i=0;
        int j=0;
        while(j<n2 && i < n1){

            if(s.charAt(i)==t.charAt(j)){
                f=true;
                i++;
            }
            else{
                f=false;
            }

            j++;
        }
        return i == n1;
    }
}
        