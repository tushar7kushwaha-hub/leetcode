class MyHashMap {
    private final int[] bl = new int[1000001];
    private final boolean[] tf = new boolean[1000001];
    // public MyHashMap() {
        
    // }
    public void put(int key, int value) {
        bl[key]=value;
        tf[key]=true;
    }
    
    public int get(int key) {
        if(tf[key]){
            return bl[key];
        }
        return -1;
    }
    
    public void remove(int key) {
        bl[key]=0;
        tf[key]=false;
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */