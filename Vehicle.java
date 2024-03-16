package in.acts.cdac;

public class Vehicle {
//     String model;
//     String color;        //field // instance var
//     int price;
	public static void print(String m1) {
		System.out.println("Model is :"  +m1); // method define
	}
	public static void print(String m1 , String m2, int p1) {
		
		System.out.println("Color is :" +m2);
		System.out.println("Price is :" +p1);
	}
	
	public static void main(String[] args) {
		//Vehicle veh = new Vehicle ();

		
		Vehicle.print( "S105");
		Vehicle.print( "S105","Black" ,125000); //method calling
		
	}

}
