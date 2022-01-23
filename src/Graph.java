class Graph {

    class Edge {
        int src, dest;
    }

    // Number of vertices and edges
    int vertices, edges;

    Edge[] edge;

    Graph(int vertices, int edges) {
        this.vertices = vertices;
        this.edges = edges;

        edge = new Edge[edges];
        for (int i = 0; i < edges; i++) {
            edge[i] = new Edge();
        }
    }

    public static void main(String[] args) {
        int numVertices = 5;
        int numEdges = 7;
        Graph g = new Graph(numVertices, numEdges);

        g.edge[0].src = 1;
        g.edge[0].dest = 2;

        g.edge[1].src = 1;
        g.edge[1].dest = 3;

        g.edge[2].src = 1;
        g.edge[2].dest = 4;

        g.edge[3].src = 2;
        g.edge[3].dest = 3;

        g.edge[4].src = 2;
        g.edge[4].dest = 4;

        g.edge[5].src = 3;
        g.edge[5].dest = 5;

        g.edge[6].src = 4;
        g.edge[6].dest = 5;

        for (int i = 0; i < numEdges; i++) {
            System.out.println(g.edge[i].src + " - " + g.edge[i].dest);
        }
    }
}