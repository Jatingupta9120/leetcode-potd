class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        List<List<Integer>>  res = new ArrayList<>();
        HashMap<Integer, Integer> var1 = new HashMap<>();
        for (int i = 0; i < matches.length; i++) {
             var1.put(matches[i][1],  var1.getOrDefault(matches[i][1], 0) + 1);
             var1.put(matches[i][0],  var1.getOrDefault(matches[i][0], 0));
        }
         res.add(new ArrayList<>());
         res.add(new ArrayList<>());
        for (Map.Entry<Integer, Integer> entry :  var1.entrySet()) {
            if (entry.getValue() == 0)
                 res.get(0).add(entry.getKey());
            else if (entry.getValue() == 1)
                 res.get(1).add(entry.getKey());
        }

        Collections.sort( res.get(0));
        Collections.sort( res.get(1));

        return res;
    }
}