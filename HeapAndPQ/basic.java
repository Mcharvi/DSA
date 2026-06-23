package HeapAndPQ;
import java.util.PriorityQueue;

public class basic {

    public static void main(String[] args) {
        PriorityQueue <Integer> pq = new PriorityQueue<>();
        pq.add(2);
        System.out.println(pq);
        pq.add(10);
                System.out.println(pq);

        pq.add(1);
        System.out.println(pq);

        pq.poll();
        System.out.println(pq);

        pq.add(0);
        System.out.println(pq);

    }
    
}
