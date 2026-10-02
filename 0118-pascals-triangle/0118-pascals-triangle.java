class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> sub = new ArrayList<>();
        if(numRows==0) return res;
        
        sub.add(1);
        res.add(sub);
        
        
        for(int i = 1;i<numRows;i++){
            List<Integer> a = res.get(i-1);
            
            System.out.println(a.toString());
            List<Integer> b = new ArrayList<>();
            b.add(1);
            for(int j = 1;j<i;j++){
                
                b.add(a.get(j-1)+a.get(j));
            }
            b.add(1);
            res.add(b);
        }
        return res;
    }
}