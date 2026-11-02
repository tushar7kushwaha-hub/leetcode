class MyHashSet {
    private final boolean[] set = new boolean[1000001];
    // public MyHashSet() {
        
    // }
    public void add(int key) {
        if(set[key]==false){
            set[key] = true;
        }
    }
    
    public void remove(int key) {
        if(set[key]==true){
            set[key] = false;
        }
    }
    
    public boolean contains(int key) {
        return set[key];
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */