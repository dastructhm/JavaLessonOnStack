import java.util.*;

public class Main {

    public static void main(String[] args) {
        Stack<Integer> myStack = new Stack<Integer>();
        System.out.println("Current elements in my stack: " + myStack);

        System.out.print("Please enter your 1st element: ");
        Scanner UserInput1 = new Scanner(System.in);
        int myInteger = UserInput1.nextInt();
        myStack.push(myInteger);
        System.out.println("After adding element " + myInteger + ", current elements in my stack: " + myStack);

        System.out.print("Please enter your 2nd element: ");
        Scanner UserInput2 = new Scanner(System.in);
        int myInteger2 = UserInput2.nextInt();
        myStack.push(myInteger2);
        System.out.println("After adding element " + myInteger2 + ", current elements in my stack: " + myStack);

        System.out.print("Please enter your 3rd element: ");
        Scanner UserInput3 = new Scanner(System.in);
        int myInteger3 = UserInput2.nextInt();
        myStack.push(myInteger3);
        System.out.println("After adding element " + myInteger3 + ", current elements in my stack: " + myStack);

        System.out.println("The current topmost element is " + myStack.peek() + " in my stack: " + myStack);
        System.out.println("After removing the most recently added element " + myStack.pop() + ", current elements in my stack: " + myStack);

        System.out.println("The current topmost element is " + myStack.peek() + " in my stack: " + myStack);
        System.out.println("After removing the 2nd most recently added element " + myStack.pop() + ", current elements in my stack: " + myStack);

        System.out.println("The current topmost element is " + myStack.peek() + " in my stack: " + myStack);
        System.out.println("After removing the 3rd most recently added element " + myStack.pop() + ", current elements in my stack: " + myStack);
    }
}