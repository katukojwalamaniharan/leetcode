class StockSpanner {
    public Stack<pair> st=new Stack<>();
    public StockSpanner() {
        // st = new stack<>();
    }
    
    public int next(int price) {
        int span = 1;
        while(!st.isEmpty() && st.peek().price<=price){
            span = span + st.pop().span;
        }
        st.push(new pair(price,span));
        return span;
    }
    class pair{
        int price;
        int span;
        pair(int price,int span){
            this.price = price;
            this.span = span;
        }
    }
}
