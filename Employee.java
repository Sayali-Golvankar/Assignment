package in.acts.cdac;
//overload with int double string
public class Employee {
   public static void show(String S1, int T1) {
	   System.out.println("Name of Employee : " +S1);
	   System.out.println("EmployeeID : " +T1);
   }
   public static void show(float D1) {
	   System.out.print("%f.3 Salary of Employee : " +D1);
   }
	
	public static void main(String[] args) {
		Employee.show("Prathmesh", 140 );
		Employee.show(20.555f);
		
	}


	

}
