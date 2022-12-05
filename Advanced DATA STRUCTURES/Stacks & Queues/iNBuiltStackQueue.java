import java.util.*;
public class iNBuiltStackQueue {
    public static void main(String[] args) {
        //Stack🙌
        Stack<Integer> stack = new Stack<>();
        stack.push(34);
        stack.push(45);
        stack.push(2);
        stack.push(9);
        stack.push(18);
        stack.push(1);
        stack.clear();                   //empties the entire stack at once

        // System.out.println(stack.pop());
        // System.out.println(stack.pop());
        // System.out.println(stack.pop());
        // System.out.println(stack.pop());
        // System.out.println(stack.pop());
        // System.out.println(stack.pop());

        if(stack.isEmpty()){
            System.out.println("Empty Stack");
        }
        //Inbuit Queue👌
        Queue<Integer> queue = new LinkedList<>();
        queue.add(3);
        queue.add(6);
        queue.add(5);
        queue.add(19);
        queue.add(1);

        System.out.println(queue.remove());
        System.out.println(queue.remove());

        //Double Ended Queue
        // Deque<Integer> deque = new ArrayDeque<>();
        // deque.add(89);
        // deque.addLast(78);
        // deque.removeFirst();
        // etc etc
    }
}