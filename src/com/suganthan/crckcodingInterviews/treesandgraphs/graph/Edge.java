package com.suganthan.crckcodingInterviews.treesandgraphs.graph;

/**
 * Created by msuganthan on 14/7/18.
 */
public class Edge {

    private static final int DEFAULT_WEIGHT = 1;
    Vertex v1, v2;
    int weight;

    public Edge(Vertex v1, Vertex v2) {
        this(v1, v2, DEFAULT_WEIGHT);
    }

    public Edge(Vertex v1, Vertex v2, int weight) {
        super();
        this.v1 = v1;
        this.v2 = v2;
        this.weight = weight;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Edge)) return false;
        Edge edge = (Edge) obj;
        return edge.v1.equals(this.v1) && edge.v2.equals(this.v2)
                && ((Edge) obj).getWeight() == this.getWeight();
    }

    @Override
    public int hashCode() {
        int result = v1.hashCode();
        result = 31 * result + v2.hashCode();
        result = 31 * result + weight;
        return result;
    }

    public Vertex getV1() {
        return v1;
    }

    public void setV1(Vertex v1) {
        this.v1 = v1;
    }

    public Vertex getV2() {
        return v2;
    }

    public void setV2(Vertex v2) {
        this.v2 = v2;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
