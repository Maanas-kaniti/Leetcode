class Solution {
    public int maxNumberOfFamilies(int n, int[][] reservedSeats) {
        Arrays.sort(reservedSeats, (a, b) -> Integer.compare(a[0], b[0]));
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        for (int[] m : reservedSeats) {
            if (!map.containsKey(m[0])) {
                map.put(m[0], new ArrayList<>());
            }
            map.get(m[0]).add(m[1]);
        }
        System.out.println(map.toString());
        int max = 0;
        for (Map.Entry<Integer, List<Integer>> entry : map.entrySet()) {
            List<Integer> arr = entry.getValue();
            boolean l = true;
            boolean r = true;
            boolean m = true;
            for(int i = 0;i<arr.size();i++){
                
                if(arr.get(i)>=2 && arr.get(i)<=5) l = false;
                if(arr.get(i)>=4 && arr.get(i)<=7) m = false;
                if(arr.get(i)>=6 && arr.get(i)<=9) r = false;
                
            }
            if(l && r) max+=2;
            else if(l || r || m) max+=1;
        }
        max += (n - map.size() > 0) ? (n - map.size()) * 2 : 0;
        return max;
    }

}