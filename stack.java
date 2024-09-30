import java.util.Stack;
import java.util.String;

public class StackOperations {
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();


        push(stack, 5);
        push(stack, 10);
        pop(stack);
        push(stack, 7);
        peek(stack);
        pop(stack);
        push(stack, 3);
    }

    public static void push(Stack<Integer> stack, int item) {
        stack.push(item);
        System.out.println("Pushed " + item + ": " + stack);
    }

    public static void pop(Stack<Integer> stack) {
        if (!stack.isEmpty()) {
            int item = stack.pop();
            System.out.println("Popped " + item + ": " + stack);
        } else {
            System.out.println("Stack is empty. Cannot pop.");
        }
    }

    public static void peek(Stack<Integer> stack) {
        if (!stack.isEmpty()) {
            int item = stack.peek();
            System.out.println("Peek: " + item);
        } else {
            System.out.println("Stack is empty. Cannot peek.");
        }
    }
}
