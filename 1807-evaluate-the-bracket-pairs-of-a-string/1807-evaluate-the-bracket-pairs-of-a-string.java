import java.util.*;
class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        HashMap<String,String> map= new HashMap<>();
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i<knowledge.size();i++){
            map.put(knowledge.get(i).get(0),knowledge.get(i).get(1));
        }
        System.out.println(map.get("name"));
        int flag = 0;
        StringBuilder str = new StringBuilder();
        for(int i = 0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch=='('){
                flag = 1;
            }
            else if(ch==')'){
                String n = (map.get(String.valueOf(str))!=null)? map.get(String.valueOf(str)) : "?";
                sb.append(n);
                flag = 0;
            }
            if(flag==1){
                // System.out.println(ch);
                if(ch!='('){
                    str.append(ch);
                }
            }else{
                str = new StringBuilder();
                if(ch!=')'){
                    sb.append(ch);
                }

            }
            System.out.println(str);
        }
        
        return sb.toString();
    }
}