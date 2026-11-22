class Solution {
    public List<List<Integer>> backtrack(int[] arr, int t, int i, List<Integer> curr, List<List<Integer>> res) {
        if (t == 0) {
            res.add(new ArrayList<>(curr));
            return res;
        }
        if (i == arr.length)
            return res;
       
        if (t - arr[i] >= 0) {
            
            curr.add(arr[i]);
           
            backtrack(arr, t - arr[i], i + 1, curr, res);
            curr.remove(curr.size() - 1);
        }
         while (i + 1 < arr.length && arr[i] == arr[i + 1]) {
            i++;
        }
        backtrack(arr, t, i + 1, curr, res);
        return res;
    }

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        return backtrack(candidates, target, 0, new ArrayList<>(), new ArrayList<>());
    }
}