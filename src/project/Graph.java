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
	public void AddEdge(Edge<T> newedge) {
		LinkedList<Edge<T>> temp =  map.get(newedge.getSrc());
		temp.add(newedge);
		map.put(newedge.getSrc(), temp);
	}
}
