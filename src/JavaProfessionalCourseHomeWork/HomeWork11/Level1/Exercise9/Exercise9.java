package JavaProfessionalCourseHomeWork.HomeWork11.Level1.Exercise9;

import java.util.PriorityQueue;
import java.util.Queue;

/*
9. Есть клиенты мобильного оператора, каждый клиент содержит поле isVip у нас 10 клиентов они встают в очередь,
очередь с приоритетом (вип клиенты обслуживаются раньше чем другие клиенты)
 */
public class Exercise9 {
    public static void main(String[] args) {
        Queue<Client> clients = new PriorityQueue<>(new ClientComparator());
        clients.add(new Client(1));
        clients.add(new Client(2,true));
        clients.add(new Client(3));
        clients.add(new Client(4));
        clients.add(new Client(5,true));
        clients.add(new Client(6, true));
        clients.add(new Client(7));
        clients.add(new Client(8, true));
        clients.add(new Client(9));
        clients.add(new Client(10));

        System.out.println(clients);
    }
}
