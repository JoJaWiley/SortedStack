package sortedStack;

public class Main {

    public static void sortStack(Stack<Integer> stack) {
        Stack<Integer> newStack = new Stack<>();
        newStack.push(0);
        while (!stack.isEmpty()) {
            Integer n = stack.pop();
            while (newStack.peek() > n) {
                stack.push(newStack.pop());
            }
            newStack.push(n);
        }

        int k = newStack.size();
        for (int i = 0; i < k; i++) {
            stack.push(newStack.pop());
        }
        stack.pop();
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(3);
        stack.push(1);
        stack.push(4);
        stack.push(2);

        System.out.println("Before sorting:");
        stack.printStack();

        sortStack(stack);

        System.out.println("\nAfter sorting:");
        stack.printStack();

        /*
            EXPECTED OUTPUT:
            ----------------
            Before sorting:
            4
            1
            5
            2
            3

            After sorting:
            1
            2
            3
            4
            5

        */

    }

}
