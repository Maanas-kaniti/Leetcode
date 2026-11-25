class Solution {
    public List<String> backTrack(String digits , String res ,int i ,HashMap<Character,String> map){
        List<String> r = new ArrayList<>();
        if(i==digits.length()){
            r.add(res);
            return r;
        }
        String letter = map.get(digits.charAt(i));
        for(int j = 0;j<letter.length();j++){
            res +=letter.charAt(j);
            r.addAll(backTrack(digits,res,i+1,map));
            res = res.substring(0,res.length()-1);
        }
        return r;

    }
    public List<String> letterCombinations(String digits) {
        HashMap<Character,String> map = new HashMap<>();
        map.put('2',"abc");
        map.put('3',"def");
        map.put('4',"ghi");
        map.put('5',"jkl");
        map.put('6',"mno");
        map.put('7',"pqrs");
        map.put('8',"tuv");
        map.put('9',"wxyz");
        return backTrack(digits,"",0,map);
    }
}