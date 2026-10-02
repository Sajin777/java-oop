import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class StackQueueDemo {
    public static void main(String[] args) {
        Deque<Integer> stack = new ArrayDeque<>();
        stack.push(10);
        stack.push(20);

        Queue<Integer> queue = new ArrayDeque<>();
        queue.offer(100);
        queue.offer(200);

        System.out.println("Stack pop: " + stack.pop());
        System.out.println("Queue poll: " + queue.poll());
    }
}
