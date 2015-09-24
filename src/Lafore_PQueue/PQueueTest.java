package Lafore_PQueue;

public class PQueueTest {

    public static void main(String[] args) {
        PQueue pq = new PQueue(5);

        pq.insert(30);
        pq.insert(50);
        pq.insert(10);
        pq.insert(40);

        while (!pq.isEmpty()){
            long item = pq.remove();
            System.out.print(item + " ");
        }
        System.out.println("");
    }
}
