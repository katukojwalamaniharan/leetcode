class MyStack {

    Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();
    public MyStack() {
    }
    
    public void push(int x) {
        // while(!q1.isEmpty()){
        //     q2.add(q1.poll());
        // }
        // q1.add(x);
        // while(!q2.isEmpty()){
        //     q1.add(q2.poll());
        // }
        int size = q1.size();
        q1.add(x);
        for(int i=0;i<size;i++){
            q1.add(q1.poll());
        }
    }
    
    public int pop() {
            return q1.poll();
    }
    
    public int top() {
        return q1.peek();
    }
    
    public boolean empty() {
        if(q1.isEmpty()) return true;
        return false;
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */