class Solution {
    public int finalValueAfterOperations(String[] o) {
        int x = 0;
        int n = o.length;
        String[] in = {"++X","X++"};
        for(String op : o){
            if(op.equals("++X") || op.equals("X++")){
                x++;
            }
            else{
                x--;
            }
        }
        return x;
    }
}