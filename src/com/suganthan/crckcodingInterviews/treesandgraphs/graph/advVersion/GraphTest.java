package com.suganthan.crckcodingInterviews.treesandgraphs.graph.advVersion;

/**
 * Created by msuganthan on 15/7/18.
 */
public class GraphTest {

    public static void main(String[] args) {
        DirectedGraph directedGraph = new DirectedGraph();
        directedGraph.addEdge(0, 1, 5);
        directedGraph.addEdge(0, 5, 8);
        directedGraph.addEdge(0, 2, 3);
        directedGraph.addEdge(1, 5, 4);
        directedGraph.addEdge(5, 4, 3);
        directedGraph.addEdge(2, 4, 3);

    }
}
