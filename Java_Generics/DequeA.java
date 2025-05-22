import java.util.*;
// addFirst, addLast(), removeFirst(), removeLast(), getFirst(), getLast()

public class DequeA {
    public static void main(String[] args){
        Deque<Integer> deque  = new LinkedList<>();
        deque.addFirst(2); 
        deque.addLast(3);
        deque.addFirst(1);
        deque.addLast(4);
        System.out.println(deque);
        deque.removeFirst();
        System.out.println(deque);
        
    }
}