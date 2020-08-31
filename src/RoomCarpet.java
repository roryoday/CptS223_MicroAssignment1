public class RoomCarpet {
	private RoomDimension size;
	private double carpetCost;
	public RoomCarpet(RoomDimension dim, double cost) {
		if(dim!=null)
			size = dim;
		if(cost>0)
			carpetCost=cost;
	}
	public double getTotalCost() {
		if(size==null)
			return 0;
		return size.getArea()*carpetCost;
	}
	public String toString() {
		return "Cost of carpet: $" + getTotalCost();
	}
}
