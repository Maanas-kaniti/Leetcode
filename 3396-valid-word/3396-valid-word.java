class Solution {
    public boolean isValid(String word) {
        int n = word.length();
        String str = word.toLowerCase();
        int v=0,c=0,s=0,d = 0;
        boolean flag = true;
        if(n<3){
            flag = false;
        }

        else{
            for(int i = 0 ;i<n;i++){
                if (str.charAt(i)=='a' || str.charAt(i)=='e'|| str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u'){
                v+=1;
                }
                else if(Character.isDigit(str.charAt(i))){
                    d+=1;
                }
                else if(!Character.isLetterOrDigit(str.charAt(i))){
                    s+=1;
                }
                else{
                    c+=1;
                }
           
            }
             if(v<1){
                flag = false;
            }
            else if(c<1){
                flag = false;
            }
            else if(s>0){
                flag = false;
            }
        }
        return flag;
    }
}