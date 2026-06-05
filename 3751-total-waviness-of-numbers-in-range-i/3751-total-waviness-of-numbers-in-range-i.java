class Solution {
    static int waves(int n){
        int count = 0;
        
        String s = String.valueOf(n);
        for(int i = 0;i<s.length()-1;i++){
            if(i!=0 && i!=s.length()-1){
                int ch = s.charAt(i);
                int prev = s.charAt(i-1);
                int next = s.charAt(i+1);
                if((ch>prev && ch>next)){
                    count++;
                }
                else if(ch<prev && ch<next) count++;
            }
        }
        return count;
    }
    public int totalWaviness(int num1, int num2) {
        int waviness = 0;
        for(int i = num1;i<num2+1;i++){
            if(i<100) continue;
            waviness+=waves(i);
        }
        return waviness;
    }
}