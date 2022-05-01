import java.util.*;
public class Postfix {

    static int evaluate(String s){
        Stack<Integer> stack = new Stack<Integer>();
        if(s.equals("")){
            return 0;
        }
        for(int i=0;i<s.length();i++){

            if(s.charAt(i) == '+'){
                int x = stack.pop();
                int y = stack.pop();
                stack.push(x+y);
            }
            else if(s.charAt(i) == '-'){
                int x = stack.pop();
                int y = stack.pop();
                stack.push(x-y);

            }
            else if(s.charAt(i) == '*'){
                int x = stack.pop();
                int y = stack.pop();
                stack.push(x*y);

            }
            else if(s.charAt(i) == '/'){
                int x = stack.pop();
                int y = stack.pop();
                stack.push(y/x);

            }
            else{
               int d = Character.getNumericValue(s.charAt(i));
               if(d>=0 && d<=9){
                  stack.push(d);
               }
            }
           
        }
        return stack.pop();

    }
    public static void main(String args[]){
        String s = "42/3+";
        int result = evaluate(s);
        System.out.println(result);
    }
    
}
