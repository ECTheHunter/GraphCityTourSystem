package project;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new mainpanel();
		Region sisliRegion = new Region("sisli", "sislilandmarks");
		Region besiktasRegion = new Region("besiktas", "besiktaslandmarks");
		Graph<Region> citymap = new Graph<Region>();
		citymap.addVertex(besiktasRegion);
		citymap.addVertex(sisliRegion);
		citymap.AddEdge(new RegionEdge(besiktasRegion, sisliRegion, 5, 2));
		citymap.AddEdge(new RegionEdge(sisliRegion, besiktasRegion, 5, 2));

	}

}
