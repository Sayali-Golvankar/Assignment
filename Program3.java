package in.acts.cdac;
//arithmetic operation of int double float handle widening
public class Program3 {

	public static void main(String[] args) {
		int a = 15;
		double d = 10.5;
		float f= 12.5f;
		
		
		double Result1 = a +  d;  //int to double wide
		float Result2 = a *  f ; //int to float
		double Result3 =  d /  f ; //float to double
		
	
		System.out.println("Result1 :" +Result1);
		System.out.println("Result1 :" +Result2);
		System.out.println("Result1 :" +Result3);
	}

}
