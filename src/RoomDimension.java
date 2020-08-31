
public class RoomDimension {
	private double length;
	private double width;
	public RoomDimension(double len, double w) {
		if(len>0)
			length = len;
		if(w>0)
			width = w;
	}
	public double getArea() {
		return length*width;
	}
	public String toString() {
		return "Area of room: " + getArea() + " square feet";
	}
}
