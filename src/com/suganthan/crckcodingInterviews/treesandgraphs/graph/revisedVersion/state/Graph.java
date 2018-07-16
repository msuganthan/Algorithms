package com.suganthan.crckcodingInterviews.treesandgraphs.graph.revisedVersion.state;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by msuganthan on 15/7/18.
 */
public class Graph {
    public static int MAX_VERTICES = 6;
    public Node vertices[];
    public int count;

    public Graph() {
        vertices = new Node[MAX_VERTICES];
        count = 0;
    }

    public void addNode(Node node) {
        if (count < vertices.length) {
            vertices[count] = node;
            count++;
        } else {
            System.out.println("Graph full");
        }
    }

    public Node[] getVertices() {
        return vertices;
    }

    public static Graph createGraph() {
        Graph graph = new Graph();
        Node[] vertices = new Node[MAX_VERTICES];
        vertices[0] = new Node("a", 3);
        vertices[1] = new Node("b", 0);
        vertices[2] = new Node("c", 0);
        vertices[3] = new Node("d", 1);
        vertices[4] = new Node("e", 1);
        vertices[5] = new Node("f", 0);

        vertices[0].addAdjacent(vertices[1]);
        vertices[0].addAdjacent(vertices[2]);
        vertices[0].addAdjacent(vertices[3]);
        vertices[3].addAdjacent(vertices[4]);
        vertices[4].addAdjacent(vertices[5]);

        for (int i = 0; i < MAX_VERTICES; i++) {
            graph.addNode(vertices[i]);
        }
        return graph;
    }
}
