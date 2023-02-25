package transport;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class ServiceStation extends PriorityQueue {

    private Queue<Transport<?>> queue;

    public Queue<Transport<?>> getQueue() {
        return queue;
    }

    public ServiceStation() {
        this.queue = new LinkedList<>();
    }

    public void addAutoQueue(Transport<?> transport) {
        if (transport.getType().equals(Type.BUS)) {
            System.out.println("Автобусам не нужно вставать в очередь");

        } else {
            queue.offer(transport);
            System.out.println(transport + " встал в очередь на техническое обслуживание");
        }
    }

    public void carryOutMaintenance() {
        while (queue.size() > 0) {
            System.out.println(queue.remove() + " прошёл техобслуживание.");
        }
    }

}
