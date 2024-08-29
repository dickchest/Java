package YouTubeChannel.GraphDijkstra;

public class App {
    public static void main(String[] args) {
        Vertex A = new Vertex("A");
        Vertex B = new Vertex("B");
        Vertex C = new Vertex("C");
        Vertex D = new Vertex("D");
        Vertex E = new Vertex("E");
        Vertex F = new Vertex("F");
        Vertex G = new Vertex("G");
        Vertex H = new Vertex("H");

        A.addNeighbour(new Edge(5, A, B));
        A.addNeighbour(new Edge(8, A, H));
        A.addNeighbour(new Edge(9, A, E));
        B.addNeighbour(new Edge(4, B, H));
        B.addNeighbour(new Edge(12, B, C));
        B.addNeighbour(new Edge(15, B, D));
        C.addNeighbour(new Edge(3, C, D));
        C.addNeighbour(new Edge(11, C, G));
        D.addNeighbour(new Edge(9, D, G));
        E.addNeighbour(new Edge(5, E, H));
        E.addNeighbour(new Edge(4, E, F));
        E.addNeighbour(new Edge(20, E, G));
        F.addNeighbour(new Edge(1, F, C));
        F.addNeighbour(new Edge(13, F, G));
        H.addNeighbour(new Edge(7, H, C));
        H.addNeighbour(new Edge(6, H, F));

        Dijkstra dijkstra = new Dijkstra();
        dijkstra.compute(A);
        System.out.println(D.getDistance());
        dijkstra.showPath(D);
    }
}
