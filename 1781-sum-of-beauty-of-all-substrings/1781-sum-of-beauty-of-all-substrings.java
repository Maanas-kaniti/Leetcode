class Solution {
    public int beautySum(String s) {
        int i = 0;
        int j = 0;
        int max = 0;
        int min = Integer.MAX_VALUE;

        int sum = 0;
        int count = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        while (i < s.length()) {

            if (j < s.length()) {
                char ch = s.charAt(j);
                map.put(ch, map.getOrDefault(ch, 0) + 1);
                max = 0;
                min = Integer.MAX_VALUE;
                for(Map.Entry<Character,Integer> entry : map.entrySet()){
                    max = Math.max(max,entry.getValue());
                    min = Math.min(min,entry.getValue());
                }
                if(map.size()==1) sum+=0;
                else sum+=max-min;
                j++;
            } else {
                map = new HashMap<>();
                i++;
                j = i;
                max = 0;
                min = Integer.MAX_VALUE;
                
            }
        }
        return sum;
    }
}