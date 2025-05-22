import java.util.*;
public class Stack_Basics{
    public static class Stack{
        static ArrayList<Integer>s = new ArrayList<>();
        //push
        public static void push(int data){
            s.add(data);
        }
        // pop 
        public static int pop(){
            int top = s.get(s.size()-1);
            s.remove (s.size()-1);
            return top;
        }
        //peek
        public static int peek(){
            return s.get(s.size()-1);
        }
        public static void printStack(){
            System.out.println("Stack Elements are: ");
            for(int i = s.size()-1; i>=0; i--){
                System.out.print(s.get(i)+" ");
            }
        }
    }
    public static void main(String[] args){
        Stack.push(2);
        Stack.push(3);
        Stack.printStack();
    }
}