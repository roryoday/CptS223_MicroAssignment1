import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter length of room (in feet): "); 
		double l = s.nextDouble();
		System.out.println("Enter width of room (in feet): "); 
		double w = s.nextDouble();
		RoomDimension d = new RoomDimension(l,w);
		
		System.out.println("Enter price of carpet (per square foot): "); 
		double p = s.nextDouble();
		RoomCarpet c = new RoomCarpet(d,p);
		
		System.out.println(d.toString());
		System.out.println(c.toString());
		
		s.close();
	}
}
