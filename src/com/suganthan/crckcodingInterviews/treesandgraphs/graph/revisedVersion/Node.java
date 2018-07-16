package com.suganthan.crckcodingInterviews.treesandgraphs.graph.revisedVersion;

/**
 * Created by msuganthan on 15/7/18.
 */
public class Node {
    public String value;
    public Node[] nodes;
    public boolean visited;

    public Node(String value) {
        this.value = value;
    }

    public Node(String value, Node[] nodes) {
        this.value = value;
        this.nodes = nodes;
    }
}
