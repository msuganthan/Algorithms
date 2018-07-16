package com.suganthan.crckcodingInterviews.treesandgraphs.graph.revisedVersion.state;

/**
 * Created by msuganthan on 15/7/18.
 */
public class Node {
    private Node adjacent[];
    private int adjacentCount;
    private String vertex;
    private State state;

    public Node(String vertex, int adjacentLength) {
        this.vertex = vertex;
        adjacentCount = 0;
        adjacent = new Node[adjacentLength];
    }

    public void addAdjacent(Node node) {
        if (adjacentCount < adjacent.length) {
            this.adjacent[adjacentCount] = node;
            adjacentCount++;
        } else {
            System.out.println("No more adjacent can be added");
        }
    }

    public Node[] getAdjacent() {
        return adjacent;
    }

    public String getVertex() {
        return vertex;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
