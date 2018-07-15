package com.suganthan.crckcodingInterviews.treesandgraphs.graph;

/**
 * Created by msuganthan on 14/7/18.
 */
public class Vertex {

    int uniqueLabel;

    public Vertex(int uniqueLabel) {
        super();
        this.uniqueLabel = uniqueLabel;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof Vertex)) return false;
        Vertex vertex = (Vertex) obj;
        return vertex.uniqueLabel == this.uniqueLabel;
    }

    @Override
    public int hashCode() {
        return this.uniqueLabel;
    }

    public int getUniqueLabel() {
        return uniqueLabel;
    }

    public void setUniqueLabel(int uniqueLabel) {
        this.uniqueLabel = uniqueLabel;
    }
}
