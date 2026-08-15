class Solution {
    public boolean isIsomorphic(String s, String t) {

        HashMap<Character,Character> map = new HashMap<>();
        HashMap<Character,Character> map1 = new HashMap<>();

        for(int i = 0;i<s.length();i++){
            if(!map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),t.charAt(i));
            }
            if(!map1.containsKey(t.charAt(i))){
                map1.put(t.charAt(i),s.charAt(i));
            }
        }
        System.out.println(map);
        System.out.println(map1);
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        for(int i = 0;i<s.length();i++){
            char ch = s.charAt(i);
            char ch2 = t.charAt(i);
            sb.append(map.get(ch));
            sb2.append(map1.get(ch2));
            
        }
        return sb.toString().equals(t) && sb2.toString().equals(s);
    }
}