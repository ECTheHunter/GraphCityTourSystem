package project;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new mainpanel();
		Region sisliRegion = new Region("sisli", "sislilandmarks");
		Region besiktasRegion = new Region("besiktas", "besiktaslandmarks");
		Region beyogluregion = new Region("beyoglu", "beyoglulandmarks");
		Graph<Region> citymap = new Graph<Region>();
		citymap.addVertex(besiktasRegion);
		citymap.addVertex(sisliRegion);
		citymap.addVertex(beyogluregion);
		citymap.AddEdge(new RegionEdge(besiktasRegion, sisliRegion, 5, 2), true);
		citymap.AddEdge(new RegionEdge(besiktasRegion, beyogluregion, 3, 1), true);
		citymap.PrintAdjacentVertices(besiktasRegion);
		citymap.PrintAdjacentVertices(sisliRegion);
		citymap.PrintAdjacentVertices(beyogluregion);


	}

}
