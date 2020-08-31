import java.util.Scanner;
/*
* Name: Rory O'Day
* CptS 233: MicroAssignment #1
* Date: 08/31/2020
* gitRepo url: https://github.com/roryoday/CptS223_MicroAssignment1.git
*/
public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter length of room (in feet): "); 
		double l = s.nextDouble();
		System.out.println("Enter width of room (in feet): "); 
		double w = s.nextDouble();
		RoomDimension d = new RoomDimension(l,w);
		
		System.out.println("Enter price of carpet (per square feet): "); 
		double p = s.nextDouble();
		RoomCarpet c = new RoomCarpet(d,p);
		
		System.out.println(d.toString());
		System.out.println(c.toString());
		
		s.close();
	}
}
