package com.suganthan.crckcodingInterviews.treesandgraphs.graph.revisedVersion.state;

import java.util.LinkedList;

/**
 * Given a directed graph, design an algorithm to find out whether there is a
 * route between two nodes.
 * Created by msuganthan on 15/7/18.
 */
public class RouteBtwNodes {
    public static void main(String[] args) {
        Graph graph = Graph.createGraph();
        Node[] nodes = graph.getVertices();
        Node start = nodes[3];
        Node end = nodes[2];
        System.out.println(search(graph, start, end));
    }

    static boolean search(Graph graph, Node start, Node end) {
        LinkedList<Node> queue = new LinkedList<>();
        for (Node node : graph.getVertices()) {
            node.setState(State.Unvisited);
        }
        start.setState(State.Visiting);
        queue.add(start);
        Node u;
        while(!queue.isEmpty()) {
            u = queue.removeFirst();
            if (u != null) {
                for (Node adjacent : u.getAdjacent()) {
                    if (adjacent.getState() == State.Unvisited) {
                        if (adjacent == end)
                            return true;
                        else {
                            adjacent.setState(State.Visiting);
                            queue.add(adjacent);
                        }
                    }
                }
                u.setState(State.Visited);
            }
        }
        return false;
    }
}

/**
 * My Thought: What I can say
 */