/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package routefinder;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author l-bishop
 */
public class Node implements Comparable<Node>
{   
    protected String name;
    private boolean visited;
    protected int curvature;
    private double comparableValue;
    private List<Edge> adjacenciesList;
    private Node predecessor;
    private double distance = Double.MAX_VALUE;
    public Node() 
    {
	this.adjacenciesList = new ArrayList<>();
    }
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public void addNeighbour(Edge edge)
    {
	this.adjacenciesList.add(edge);
    }
    public double getComparableValue()
    {
        return comparableValue;
    }
    public void setComparableValue(int value)
    {
        comparableValue = value;
    }
    public int getCurvature()
    {
        return curvature;
    }
    public void setCurvature(int curvature)
    {
        this.curvature = curvature;
    }
    public List<Edge> getAdjacenciesList()
    {
        return adjacenciesList;
    }
    public boolean isVisited()
    {
        return visited;
    }
    public void setVisited(boolean visited)
    {
        this.visited = visited;
    }
    public Node getPredecessor()
    {
        return predecessor;
    }
    public void setPredecessor(Node predecessor)
    {
        this.predecessor = predecessor;
    }
    public double getDistance()
    {
        return distance;
    }
    public void setDistance(double distance)
    {
        this.distance = distance;
    }
    
    @Override
    public int compareTo(Node otherNode) 
    {
    	return Double.compare(this.getComparableValue(), otherNode.getComparableValue());
    }
}
