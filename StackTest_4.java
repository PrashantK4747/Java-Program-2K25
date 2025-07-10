interface Stack {
    int size = 5;

    void push(String item);
    String pop();
    void display();
    boolean overflow();
    boolean underflow();
}
class IntegerStack implements Stack {
    private int[] stack = new int[size];
    private int top = -1;

    @Override
    public void push(String item) {
        if (!overflow()) {
            stack[++top] = Integer.parseInt(item);
        } else {
            System.out.println("Stack Overflow in IntegerStack");
        }
    }

    @Override
    public String pop() {
        if (!underflow()) {
            return String.valueOf(stack[top--]);
        } else {
            System.out.println("Stack Underflow in IntegerStack");
            return null;
        }
    }

    @Override
    public void display() {
        System.out.print("IntegerStack: ");
        for (int i = 0; i <= top; i++) {
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }

    @Override
    public boolean overflow() {
        return top == size - 1;
    }

    @Override
    public boolean underflow() {
        return top == -1;
    }
}
class StringStack implements Stack {
    private String[] stack = new String[size];
    private int top = -1;

    @Override
    public void push(String item) {
        if (!overflow()) {
            stack[++top] = item;
        } else {
            System.out.println("Stack Overflow in StringStack");
        }
    }

    @Override
    public String pop() {
        if (!underflow()) {
            return stack[top--];
        } else {
            System.out.println("Stack Underflow in StringStack");
            return null;
        }
    }

    @Override
    public void display() {
        System.out.print("StringStack: ");
        for (int i = 0; i <= top; i++) {
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }

    @Override
    public boolean overflow() {
        return top == size - 1;
    }

    @Override
    public boolean underflow() {
        return top == -1;
    }
}
class DoubleStack implements Stack {
    private double[] stack = new double[size];
    private int top = -1;

    @Override
    public void push(String item) {
        if (!overflow()) {
            stack[++top] = Double.parseDouble(item);
        } else {
            System.out.println("Stack Overflow in DoubleStack");
        }
    }

    @Override
    public String pop() {
        if (!underflow()) {
            return String.valueOf(stack[top--]);
        } else {
            System.out.println("Stack Underflow in DoubleStack");
            return null;
        }
    }

    @Override
    public void display() {
        System.out.print("DoubleStack: ");
        for (int i = 0; i <= top; i++) {
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }

    @Override
    public boolean overflow() {
        return top == size - 1;
    }

    @Override
    public boolean underflow() {
        return top == -1;
    }
}
public class StackTest_4 {
    public static void main(String[] args) {
        Stack intStack = new IntegerStack();
        Stack strStack = new StringStack();
        Stack dblStack = new DoubleStack();

        // Push elements
        intStack.push("10");
        intStack.push("20");
        intStack.push("30");

        strStack.push("Hello");
        strStack.push("World");

        dblStack.push("1.1");
        dblStack.push("2.2");
        dblStack.push("3.3");

        // Display stacks
        intStack.display();
        strStack.display();
        dblStack.display();

        // Pop elements
        System.out.println("Popped from IntegerStack: " + intStack.pop());
        System.out.println("Popped from StringStack: " + strStack.pop());
        System.out.println("Popped from DoubleStack: " + dblStack.pop());

        // Display again
        intStack.display();
        strStack.display();
        dblStack.display();
    }
}
