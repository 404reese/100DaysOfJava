class MyQueue {
     private Stack<Integer> main;
     private Stack<Integer> helper;

    public MyQueue() {
        main = new Stack<>();
        helper = new Stack<>();
    }

    public void push(int x) {


        while(main.size()>0){
            helper.push(main.pop());
        }

        main.push(x);

        while(helper.size()>0){
            main.push(helper.pop());
        }
    }

    public int pop() {
        return main.pop();
    }

    public int peek() {
        return main.peek();
    }

    public boolean empty() {
        return main.size()==0;
    }
}