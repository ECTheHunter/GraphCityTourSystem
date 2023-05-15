package project;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

import javax.swing.DefaultListModel;

public class Graph<T> {
	private T currentvertex;
	private HashMap<T, LinkedList<Edge<T>>> map = new HashMap<T, LinkedList<Edge<T>>>();

	public T getCurrentvertex() {
		return currentvertex;
	}
	public HashMap<T, LinkedList<Edge<T>>> getMap() {
		return map;
	}
	public void addVertex(T newvertex) {
		map.put(newvertex, new LinkedList<Edge<T>>());
		
	}
	public void AddEdge(Edge<T> newedge, boolean bothway) {
		LinkedList<Edge<T>> temp =  map.get(newedge.getSrc());
		temp.add(newedge);
		map.put(newedge.getSrc(), temp);
		if(bothway) {
			LinkedList<Edge<T>> tempdst =  map.get(newedge.getDst());
			Edge<T> e = (Edge<T>)new RegionEdge();
			e = newedge;
			RegionEdge re = (RegionEdge)e;
			tempdst.add((Edge<T>)new RegionEdge(re.getDst(), re.getSrc(), re.getDistance(), re.getTraveltime()));
			map.put(newedge.getDst(), tempdst);
			
		}
	}
	public void PrintAdjacentVertices(Region vertex) {
		LinkedList<Edge<T>> ll = map.get(vertex);
		for (Edge<T> edge : ll) {
			Edge<T> e = (Edge<T>)new RegionEdge();
			e = edge;
			RegionEdge re = (RegionEdge)e;
			System.out.println(re.getSrc() +" "+ re.getDistance() + " "+re.getDst());
		}
	}
	public float getTimes(Region vertex,Region vertex1) {
		LinkedList<Edge<T>> ll = map.get(vertex);
    	float time = 0;
		for (Edge<T> edge : ll) {
			Edge<T> e = (Edge<T>)new RegionEdge();
			e = edge;
			RegionEdge re = (RegionEdge)e;
			if(re.getDst().getName()==vertex1.getName())
			time = re.getTraveltime();
		}
		return time;
	}
    public float getDistances(Region vertex,Region vertex1) {
    	LinkedList<Edge<T>> ll = map.get(vertex);
    	float distance = 0;
		for (Edge<T> edge : ll) {
			Edge<T> e = (Edge<T>)new RegionEdge();
			e = edge;
			RegionEdge re = (RegionEdge)e;
			if(re.getDst().getName()==vertex1.getName())
			distance = re.getDistance();
		}
		return distance;
	}
	
		
	
	public void setCurrentvertex(T currentvertex) {
		this.currentvertex = currentvertex;
	}
}
