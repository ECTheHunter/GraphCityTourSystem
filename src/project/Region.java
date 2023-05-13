package project;

public class Region{

	private String name;
	private String landmarks;
	public Region(String name, String landmarks) {
		super();
		this.name = name;
		this.landmarks = landmarks;
	}
	public String getName() {
		return name;
	}
	public String getLandmarks() {
		return landmarks;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name;
	}
}
