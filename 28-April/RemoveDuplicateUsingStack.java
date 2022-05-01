package 28-April;
import java.util.*;
public class RemoveDuplicateUsingStack {

    static int[] remove(int arr[]){
        Stack<Integer> myStack = new Stack<Integer>();
        myStack.push(arr[0]);
        for(int i=1;i<arr.length;i++){
            if(arr[i] == myStack.peek()){
                myStack.pop();
                myStack.push(arr[i]);
            }  
            else{
                myStack.push(arr[i]);
            }
        }
        System.out.println(myStack);
        arr = new int[myStack.size()];
        for(int i=0;i<myStack.size();i++){
            arr[i] = myStack.get(i);
        }
        return arr;
    }

    public static void main(String args[]){
        int arr[] = {0,0,1,1,1,1,2,2,4,5};
        arr = remove(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    
}
