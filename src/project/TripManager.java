package project;

import java.util.Stack;

public class TripManager {

	private static TripManager instance;
	private Graph<Region> graph;
	private Stack<Region> visitedplaces = new Stack<Region>();

	public Stack<Region> getVisitedplaces() {
		return visitedplaces;
	}

	public Graph<Region> getGraph() {
		return graph;
	}

	private TripManager() {
		Region sisliRegion = new Region("Şişli", "Ihlamur Kasırları");
		Region besiktasRegion = new Region("Beşiktaş", "Dolmabahçe Sarayı");
		Region beyogluregion = new Region("Beyoğlu", "Galata Kulesi");
		Region uskudarregion = new Region("Üsküdar", "Beylerbeyi Sarayı");
		Region kadikoyregion = new Region("Kadiköy", "Boğa Heykeli");
		Region umraniyeregion = new Region("Ümraniye", "Hekimbaşı Av Köşkü");
		Region fatihregion = new Region("Fatih", "Ayasofya Camii");
		Region malteperegion = new Region("Maltepe", "Maltepe Sahili");
		Graph<Region> citymap = new Graph<Region>();
		citymap.addVertex(besiktasRegion);
		citymap.addVertex(sisliRegion);
		citymap.addVertex(beyogluregion);
		citymap.addVertex(uskudarregion);
		citymap.addVertex(kadikoyregion);
		citymap.addVertex(umraniyeregion);
		citymap.addVertex(fatihregion);
		citymap.addVertex(malteperegion);
		citymap.AddEdge(new RegionEdge(besiktasRegion, sisliRegion, 6.6f, 85), true);
		citymap.AddEdge(new RegionEdge(beyogluregion, fatihregion, 5.2f, 71), true);
		citymap.AddEdge(new RegionEdge(sisliRegion, beyogluregion, 2.2f, 25), true);
		citymap.AddEdge(new RegionEdge(uskudarregion, kadikoyregion, 6.8f, 85), true);
		citymap.AddEdge(new RegionEdge(uskudarregion, umraniyeregion, 6.5f, 82), true);
		citymap.AddEdge(new RegionEdge(uskudarregion, besiktasRegion, 8.6f, 127), true);
		citymap.AddEdge(new RegionEdge(kadikoyregion, umraniyeregion, 8.0f, 127), true);
		citymap.AddEdge(new RegionEdge(kadikoyregion, malteperegion, 13.7f, 189), true);
		citymap.AddEdge(new RegionEdge(umraniyeregion, malteperegion, 11.6f, 160), true);
		graph = citymap;
		/*citymap.PrintAdjacentVertices(besiktasRegion);
		citymap.PrintAdjacentVertices(sisliRegion);
		citymap.PrintAdjacentVertices(beyogluregion);*/
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
