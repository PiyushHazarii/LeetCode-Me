class MyHashMap {
    int[] data;
    public MyHashMap() {
        data = new int[1000001];
        Arrays.fill(data, -1);
    }
    public void put(int key, int val) {
        data[key] = val;
    }
    public int get(int key) {
        return data[key];
    }
    public void remove(int key) {
        data[key] = -1;
    }
}

class MyHashMap {
    Map<Integer,Integer> map;

    public MyHashMap() {
        map = new HashMap<>();
        
    }
    
    public void put(int key, int value) {
        map.put(key,value);
        
    }
    
    public int get(int key) {
        if(map.containsKey(key))
        return map.get(key);
        else
        return -1;
        
    }
    
    public void remove(int key) {
        map.remove(key);
        
    }
}

