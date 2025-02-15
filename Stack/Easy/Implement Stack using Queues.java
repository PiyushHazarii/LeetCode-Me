class MyStack {
    private Queue<Integer> s1;
    private Queue<Integer> s2;

    public MyStack() {
        s1 = new LinkedList<>();
        s2 = new LinkedList<>();
        
    }
    
    public void push(int x) {
         while (!s1.isEmpty()) {
            s2.add(s1.remove());
        }
        s1.add(x);
        while (!s2.isEmpty()) {
            s1.add(s2.remove());
        }
        
    }
    
    public int pop() {
        return s1.remove();
        
    }
    
    public int top() {
        return s1.peek();

        
    }
    
    public boolean empty() {
        return s1.isEmpty();
        
    }
}


