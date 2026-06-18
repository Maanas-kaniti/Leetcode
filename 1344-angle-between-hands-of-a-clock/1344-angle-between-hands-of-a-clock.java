class Solution {
    public double angleClock(int hour, int minutes) {
        double hd = hour*30;
        if(hour==12){
            hd = 0;
        }
       if(minutes!= 0){
        hd += 30*((double)minutes/60);
       }
       double md = minutes;
       if(md != 0){
        md = (md/5)*30;
       }
       System.out.println(hd + " "+ md);
       double res = Math.abs(Math.max(hd,md)-Math.min(hd,md));
       
       if(res>180){
        return 360 - res;
       }
       return res;
    }
}