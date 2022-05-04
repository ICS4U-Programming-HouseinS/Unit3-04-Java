import java.util.*;

public class MyIntStack {
    private Stack<Integer> _stack;

    public MyIntStack() {
        this._stack = new Stack<Integer>();
    }

    // Pushing element on the top of the stack
    public void stack_push(int input) {
        System.out.println("Added " + input + " to stack");
        _stack.push(input);
    }

    // Popping element from the top of the stack
    public int stack_pop() {
        return _stack.pop();
    }

    // Peek
    public int stack_peek() {
        return _stack.peek();
    }

    // Clear
    public void stack_clear() {
        _stack.clear();
    }
}
