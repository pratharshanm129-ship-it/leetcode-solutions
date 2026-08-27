class Solution {
    public boolean isValid(String s) {
        int l=s.length();
        char arr[]=new char[l];
        int t=-1;
        for(int i=0;i<l;i++){
            if(s.charAt(i)=='('||s.charAt(i)=='{'||s.charAt(i)=='['){
                arr[++t]=s.charAt(i);
            }
            else{
                
                if (t == -1) {
                    return false;
                    }
                if(arr[t]=='(' && s.charAt(i)==')'){
                    t--;
                }
                else if(arr[t]=='[' && s.charAt(i)==']'){
                    t--;
                }
                else if(arr[t]=='{' && s.charAt(i)=='}'){
                    t--;
                }
                else {
                    return false;
                }
            }   
        }
        return (t==-1);
    }
}