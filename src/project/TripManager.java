package project;

import java.util.Stack;

public class TripManager {

	private static TripManager instance;
	private Graph graph;
	private Stack<Region> visitedplaces = new Stack<Region>();

	public Stack<Region> getVisitedplaces() {
		return visitedplaces;
	}

	public Graph getGraph() {
		return graph;
	}

	private TripManager() {
		Region sisliRegion = new Region("sisli", "sislilandmarks");
		Region besiktasRegion = new Region("besiktas", "besiktaslandmarks");
		Region beyogluregion = new Region("beyoglu", "beyoglulandmarks");
		Graph<Region> citymap = new Graph<Region>();
		graph = citymap;
		citymap.addVertex(besiktasRegion);
		citymap.addVertex(sisliRegion);
		citymap.addVertex(beyogluregion);
		citymap.AddEdge(new RegionEdge(besiktasRegion, sisliRegion, 5, 2), true);
		citymap.AddEdge(new RegionEdge(besiktasRegion, beyogluregion, 3, 1), true);
		citymap.PrintAdjacentVertices(besiktasRegion);
		citymap.PrintAdjacentVertices(sisliRegion);
		citymap.PrintAdjacentVertices(beyogluregion);
	}
	public static TripManager getinstance() {
		
		if(instance == null) {
			instance = new TripManager();
		}
		return instance;

	}
	public void addtovisitedplaces(Region region) {
		visitedplaces.add(region);
	}
	
}
