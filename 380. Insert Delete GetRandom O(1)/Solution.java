class RandomizedSet {
     private ArrayList<Integer> list;
    private HashMap<Integer, Integer> map;
    private Random random;
    public RandomizedSet() {
        list=new ArrayList<>();
        map=new HashMap<>();
        random=new Random();
        
    }
    
    public boolean insert(int val) {
        if(map.containsKey(val))return false;
        list.add(val);
        map.put(val,list.size()-1);
        return true;
    }
    
    public boolean remove(int val) {
        if(!map.containsKey(val))return false;
        int idx=map.get(val);
        int lastele=list.get(list.size()-1);
        list.set(idx,lastele);
        map.put(lastele,idx);
        list.remove(list.size()-1);
        map.remove(val);
        return true;
    }
    
    public int getRandom() {
        int idx=random.nextInt(list.size());
        return list.get(idx);
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */