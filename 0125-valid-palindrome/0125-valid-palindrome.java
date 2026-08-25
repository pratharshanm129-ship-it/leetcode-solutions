class Solution {
    public boolean isPalindrome(String s) {

        String n = "";

        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetterOrDigit(s.charAt(i))) {
                n = n + Character.toLowerCase(s.charAt(i));
            }
        }

        for (int i = 0; i < n.length() / 2; i++) {
            if (n.charAt(i) != n.charAt(n.length() - 1 - i)) {
                return false;
            }
        }

        return true;
    }
}