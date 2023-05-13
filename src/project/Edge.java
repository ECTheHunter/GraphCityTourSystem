package project;

public class Edge<T> {

	protected T src;
	protected T dst;
	public Edge(T src, T dst) {
		super();
		this.src = src;
		this.dst = dst;
	}
	public T getSrc() {
		return src;
	}
	public T getDst() {
		return dst;
	}
	public Edge() {
		super();
	}
}
