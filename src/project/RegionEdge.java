package project;

public class RegionEdge extends Edge<Region> {
	private float distance;
	private float traveltime;
	public float getDistance() {
		return distance;
	}
	public float getTraveltime() {
		return traveltime;
	}
	public RegionEdge(Region src, Region dst, float distance, float traveltime) {
		super(src, dst);
		this.distance = distance;
		this.traveltime = traveltime;
	}
	public RegionEdge() {
		// TODO Auto-generated constructor stub
	}


}
