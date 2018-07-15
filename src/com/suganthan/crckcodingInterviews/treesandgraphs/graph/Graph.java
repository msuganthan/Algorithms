package com.suganthan.crckcodingInterviews.treesandgraphs.graph;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by msuganthan on 14/7/18.
 */
public class Graph {

    private Set<Vertex> vertices;
    private Set<Edge> edges;
    private Map<Vertex, Set<Edge>> adjacencyList;

    public Graph() {
        vertices = new HashSet<>();
        edges = new HashSet<>();
        adjacencyList = new HashMap<>();
    }

    public boolean addVertex(int label) {
        return vertices.add(new Vertex(label));
    }

    public boolean addVertex(Vertex vertex) {
        return vertices.add(vertex);
    }

    public boolean addVertices(Collection<Vertex> vertices) {
        return this.vertices.addAll(vertices);
    }

    public boolean removeVertex(int label) {
        return vertices.remove(new Vertex(label));
    }

    public boolean removeVertex(Vertex vertex) {
        return vertices.remove(vertex);
    }

    public boolean addEdge(Edge edge) {
        if (!edges.add(edge)) return false;
        adjacencyList.putIfAbsent(edge.getV1(), new HashSet<>());
        adjacencyList.putIfAbsent(edge.getV2(), new HashSet<>());

        adjacencyList.get(edge.getV1()).add(edge);
        adjacencyList.get(edge.getV2()).add(edge);

        return true;
    }

    public boolean addEdge(int vertexLabel1, int vertexLabel2) {
        return addEdge(new Edge(new Vertex(vertexLabel1),
                new Vertex(vertexLabel2)));
    }

    public boolean removeEdge(Edge edge) {
        if (!edges.remove(edge)) return false;
        Set<Edge> edgesOfV1 = adjacencyList.get(edge.v1);
        Set<Edge> edgesOfV2 = adjacencyList.get(edge.v2);

        if (edgesOfV1 != null) edgesOfV1.remove(edge);
        if (edgesOfV2 != null) edgesOfV2.remove(edge);

        return true;
    }

    public boolean removeEdge(int vertexLabel1, int vertexLabel2) {
        return removeEdge(new Edge(new Vertex(vertexLabel1),
                new Vertex(vertexLabel2)));
    }

    public Set<Vertex> getAdjacencyVertices(Vertex vertex) {
        return adjacencyList.get(vertex)
                .stream()
                .map( edge -> edge.getV1().equals(vertex) ? edge.getV2() : edge.getV1() )
                .collect(Collectors.toSet());
    }

    public Set<Vertex> getVertices() {
        return vertices;
    }

    public void setVertices(Set<Vertex> vertices) {
        this.vertices = vertices;
    }

    public Set<Edge> getEdges() {
        return edges;
    }

    public void setEdges(Set<Edge> edges) {
        this.edges = edges;
    }

    public Map<Vertex, Set<Edge>> getAdjacencyList() {
        return adjacencyList;
    }

    public void setAdjacencyList(Map<Vertex, Set<Edge>> adjacencyList) {
        this.adjacencyList = adjacencyList;
    }
}
