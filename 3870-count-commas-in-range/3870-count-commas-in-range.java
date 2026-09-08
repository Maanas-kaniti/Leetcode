class Solution {
    public int countCommas(int n) {
        int comma = 0;
        if(n>999) comma+=n-999;
        return comma;
    }
}