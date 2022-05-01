//package 28-April;
import java.util.*;

public class StackOperation {

    public static void main(String args[]){
        Stack<Integer> myStack = new Stack<>();
        myStack.push(10);
        myStack.push(20);
        System.out.println(myStack.peek());
        myStack.push(30);
        System.out.println(myStack);
        System.out.println(myStack.pop());
        System.out.println(myStack);
    }
    
}
