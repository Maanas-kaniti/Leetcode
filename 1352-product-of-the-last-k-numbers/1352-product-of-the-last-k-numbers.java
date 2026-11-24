class ProductOfNumbers {
    ArrayList<Integer> res;
    public ProductOfNumbers() {
         res = new ArrayList<>(); 
    }
    
    public void add(int num) {
        res.add(num);
    }
    
    public int getProduct(int k) {
        int len = res.size()-k;
        int prod = 1;
        for(int i = len ;i<res.size();i++){
            prod*=res.get(i);
        }
        return prod;
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */