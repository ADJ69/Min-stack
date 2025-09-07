import java.util.*;
public class Main{

public static void main (String [] args){
    MinStack minStack = new MinStack();
    
    minStack.push(12);
      minStack.push(16);
        minStack.push(6);
          minStack.push(-1);
            minStack.pop();
              minStack.top();
                minStack.getmin();
                
                System.out.println("current min =  " + minStack.getmin());
}}

class MinStack {
    private Stack <Integer> stack;
        private Stack <Integer> minstack;


public MinStack(){
stack = new Stack <>();
minstack = new Stack <>();
}

public void push (int val){

stack.push(val);
if(minstack.isEmpty() || val <=minstack.peek())
{
minstack.push(val);
}
}

public void pop (){
    if(!stack.isEmpty()){
        if(stack.peek().equals(minstack.peek()))
        minstack.pop();
    }
    stack.pop();
}
public int  top (){
    return stack.peek();
    
}
public int  getmin (){
    return minstack.peek();
    
}}