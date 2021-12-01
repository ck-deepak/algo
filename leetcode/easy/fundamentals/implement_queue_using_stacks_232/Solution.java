class MyQueue {
    
    private Stack<Integer> s1;
    private Stack<Integer> s2;
    
    public MyQueue() {
        this.s1 = new Stack<>();
        this.s2 = new Stack<>();
    }
    
    public void push(int x) {
        if (x>0) {
            s1.add(x);
        }
    }
    
    public int pop() {
        if (s2.size()!=0) {
            return s2.pop();
        }
        
        if (s1.size()!=0) {
            transferStacks(s1, s2);
            return s2.pop();
        }
        
        return 0;
    }
    
    public int peek() {
        if (s1.size()==0) {
            return s2.peek();
        } else if (s2.size()==0) {
            transferStacks(s1, s2);
            return s2.peek();
        } else {
            return s2.peek();
        }
    }
    
    public boolean empty() {
        return s1.size()==0 && s2.size()==0;
    }
    
    public void transferStacks(Stack<Integer> s1, Stack<Integer> s2) {
        while(s1.size()>0) {
            s2.add(s1.pop());
        }
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
