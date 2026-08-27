class Solution {
    public boolean isPalindrome(int x) {

        if (x < 0) {
            return false;
        }

        int y = x;
        long reversedX = 0;

        while (y > 0) {
            int digit = y % 10;
            reversedX = reversedX * 10 + digit;
            y = y / 10;
        }

        return reversedX == x;
    }
}