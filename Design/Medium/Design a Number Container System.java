class NumberContainers {
    Map<Integer, Integer> idxtonum = new HashMap<>();
    Map<Integer, TreeSet<Integer>> numtoidx = new HashMap<>();

    public NumberContainers() {
        // nothing to do;
    }
    
    public void change(int index, int number) {
        if(idxtonum.containsKey(index)){
            int previous = idxtonum.get(index);
            numtoidx.get(previous).remove(index);
            if(numtoidx.get(previous).isEmpty()){
                numtoidx.remove(previous);
            }
        }
        idxtonum.put(index, number);
        numtoidx.putIfAbsent(number, new TreeSet<>());
        numtoidx.get(number).add(index);
    }
    
    public int find(int number) {
        if(numtoidx.containsKey(number)){
            return numtoidx.get(number).first();
        }
        return -1;
    }
}

/**
 * Your NumberContainers object will be instantiated and called as such:
 * NumberContainers obj = new NumberContainers();
 * obj.change(index,number);
 * int param_2 = obj.find(number);
 */