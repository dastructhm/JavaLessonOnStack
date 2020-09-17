/*
学习目标：- 栈(抽象数据类型)是元素的集合
        - 三种操作：
            - push(压栈/入栈):在集合中添加元素
            - pop(出栈):删除最新添加的元素（访问栈顶的元素,调用后,栈顶元素从栈中被永久性地删除）
            - peek:访问栈顶元素，不修改该元素（只返回栈顶元素,而不删除它）
实际应用：- 实现深度优先搜索算法遍历时，使用栈(如果某基准节点四周不存在活节点，则认为此基准节点为死节点，将其从栈中弹出，返回上次基准节点继续探测)
        - https://www.jianshu.com/p/d60ac14da76f
概念定义：后进的元素，先出
另请参阅：- https://en.wikipedia.org/wiki/Stack_(abstract_data_type)
调用API: - https://docs.oracle.com/javase/7/docs/api/java/util/Stack.html
*/

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Stack<Integer> myStack = new Stack<>();
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
        int myInteger3 = UserInput3.nextInt();
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