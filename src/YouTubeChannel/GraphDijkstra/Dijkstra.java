package YouTubeChannel.GraphDijkstra;

import java.util.*;

public class Dijkstra {
    PriorityQueue<Vertex> queue;

    public Dijkstra() {
        queue = new PriorityQueue<>();
    }

    public void compute(Vertex source) {
        source.setDistance(0);
        queue.add(source);

        while (!queue.isEmpty()) {
            Vertex curr = queue.poll();

            for (Edge e : curr.getNeighbours()){
                Vertex end = e.getEnd();
                double w = e.getWeight();

                if (!end.isVisited()) {
                    if (curr.getDistance() + w < end.getDistance()){
                        end.setDistance(curr.getDistance() + w);
                        if (queue.contains(end))
                            queue.remove(end);
                        queue.add(end);
                        end.setPredecessor(curr);
                    }
                }
            }

            curr.setVisited(true);
        }
    }

    public void showPath(Vertex end) {
        List<Vertex> path = new ArrayList<>();
        while (end != null) {
            path.add(end);
            end = end.getPredecessor();
        }
        Collections.reverse(path);
        for (Vertex v : path) {
            System.out.print(v.getName() + " ");
        }
    }
}
