import java.util.Stack;

public class revOfStack {
    public static void pushAtBottom(int data, Stack<Integer> s) {
        if(s.size() == 0){
            s.push(data);
            return;
        }
        int top = s.pop();
        pushAtBottom(data, s);
        s.push(top);
        
    }

    public static void revOfStack(Stack<Integer> s) {
        if(s.isEmpty()){
            return;
        }
        int top = s.pop();
        revOfStack(s);
        pushAtBottom(top, s);
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        revOfStack(s);

        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}
