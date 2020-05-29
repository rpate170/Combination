class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        
        findCombination(result, list, n, k, 1);
        return result;
    }
    
    public void findCombination (List<List<Integer>> result, List<Integer> list, int n, int k, int s) {
        if (k == 0) {
            result.add(new ArrayList<>(list));
        }
        else {
            for (int i = s; i <= n-k+1; i++) {
                
                list.add(i);
                findCombination(result, list, n, k-1, i+1);
                list.remove(list.size()-1);
            }
        }
    }
}