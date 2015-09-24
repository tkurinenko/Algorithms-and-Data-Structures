package Lafore_Queue;

public class QueueTest {
    public static void main(String[] args) {
        Queue queue = new Queue(5);

        for (int i = 0; i < 4; i++) {
            queue.insert((long) (Math.random() * 99));
        }
/*        queue.insert(10);
        queue.insert(20);
        queue.insert(30);
        queue.insert(50);*/

        for (int i = 0; i < 3; i++) {
            queue.remove();
        }
        queue.insert(50);
        queue.insert(60);
        queue.insert(70);

        while (!queue.isEmpty()) {
            long n = queue.remove();
            System.out.print(n);
            System.out.print(" ");
        }
        System.out.println("");
    }
}
