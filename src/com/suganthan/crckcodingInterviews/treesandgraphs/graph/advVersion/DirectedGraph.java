package com.suganthan.crckcodingInterviews.treesandgraphs.graph.advVersion;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by msuganthan on 15/7/18.
 */
public class DirectedGraph extends AbstractGraph {

    private final Map<Integer, Map<Integer, Double>> parentMap = new LinkedHashMap<>();

    private final Map<Integer, Map<Integer, Double>> childMap = new LinkedHashMap<>();

    @Override
    public int size() {
        return parentMap.size();
    }

    @Override
    public int getNumberOfEdges() {
        return edges;
    }

    @Override
    public boolean addNode(int nodeId) {
        if (parentMap.containsKey(nodeId))
            return false;

        parentMap.put(nodeId, new LinkedHashMap<>());
        childMap.put(nodeId, new LinkedHashMap<>());
        return true;
    }

    @Override
    public boolean hasNode(int nodeId) {
        return parentMap.containsKey(nodeId);
    }

    @Override
    public boolean clearNode(int nodeId) {
        if (!hasNode(nodeId))
            return false;

        Map<Integer, Double> parents = parentMap.get(nodeId);
        Map<Integer, Double> children = childMap.get(nodeId);

        if (parents.isEmpty() && children.isEmpty())
            return false;

        for (Integer childId: children.keySet())
            parentMap.get(childId).remove(nodeId);

        for (Integer parentId: parents.keySet())
            parentMap.get(parentId).remove(nodeId);

        edges -= parents.size();
        edges -= children.size();

        parents.clear();
        children.clear();
        return true;
    }

    @Override
    public boolean removeNode(int nodeId) {
        if (!hasNode(nodeId))
            return false;

        clearNode(nodeId);
        parentMap.remove(nodeId);
        childMap.remove(nodeId);
        return true;
    }

    @Override
    public boolean addEdge(int tailNodeId, int headNodeId, double weight) {
        addNode(tailNodeId);
        addNode(headNodeId);

        if (childMap.get(tailNodeId).containsKey(headNodeId)) {
            double oldWeight = childMap.get(tailNodeId).get(headNodeId);
            childMap.get(tailNodeId).put(headNodeId, weight);
            parentMap.get(headNodeId).put(tailNodeId, weight);
            return oldWeight != weight;
        } else {
            childMap.get(tailNodeId).put(headNodeId, weight);
            parentMap.get(headNodeId).put(tailNodeId, weight);
            ++edges;
            return true;
        }
    }

    @Override
    public boolean hasEdge(int tailNodeId, int headNodeId) {
        if (!childMap.containsKey(tailNodeId))
            return false;
        return childMap.get(tailNodeId).containsKey(headNodeId);
    }

    @Override
    public double getEdgeWeight(int tailNodeId, int headNodeId) {
        if (!hasEdge(tailNodeId, headNodeId))
            return Double.NaN;
        return childMap.get(tailNodeId).get(headNodeId);
    }

    @Override
    public boolean removeEdge(int tailNodeId, int headNodeId) {
        if (!childMap.containsKey(tailNodeId))
            return false;

        if (!childMap.get(tailNodeId).containsKey(headNodeId))
            return false;
        childMap.get(tailNodeId).remove(headNodeId);
        parentMap.get(headNodeId).remove(tailNodeId);
        --edges;
        return true;
    }

    @Override
    public Set<Integer> getChildrenOf(int nodeId) {
        if (!childMap.containsKey(nodeId))
            return Collections.<Integer>emptySet();
        return Collections.<Integer>unmodifiableSet(childMap.get(nodeId).keySet());
    }

    @Override
    public Set<Integer> getParentsOf(int nodeId) {
        if (!parentMap.containsKey(nodeId)) {
            return Collections.<Integer>emptySet();
        }

        return Collections.
                <Integer>unmodifiableSet(parentMap.get(nodeId).keySet());
    }

    @Override
    public Set<Integer> getAllNodes() {
        return Collections.<Integer>unmodifiableSet(childMap.keySet());
    }

    public Map<Integer, Map<Integer, Double>> getParentMap() {
        return parentMap;
    }

    public Map<Integer, Map<Integer, Double>> getChildMap() {
        return childMap;
    }

    @Override
    public void clear() {
        childMap.clear();
        parentMap.clear();
        edges = 0;
    }
}
