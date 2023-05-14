package project;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

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
	public void setCurrentvertex(T currentvertex) {
		this.currentvertex = currentvertex;
	}
}
