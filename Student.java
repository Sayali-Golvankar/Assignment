package in.acts.cdac;
import java.util.Scanner;
public class Student {

		String name;	
         int rollno;		
		 int std;	
		
		public void aceeptRecord() {
			try( Scanner sc = new Scanner(System.in); ){
				System.out.print("Name	:	");
				this.name = sc.nextLine();
				System.out.print("rollno	:	");
				this.rollno = sc.nextInt();
				System.out.print("std	:	");
				this.std = sc.nextInt();
			}
		}
		
		
		public void printRecord( ){		//Method definition
			System.out.println("Name :" +this.name);
			System.out.println("Name :" +this.rollno);
			System.out.println("Name :" +this.std);
		
		}
		
		public static void main(String[] args) {
			
			
			Student stud= new Student();	
			
			
			stud.aceeptRecord( );	
			
			stud.printRecord( );		
			
		}
	}


/*public class Program {
	public static void main(String[] args) {
		
		//ClassName refName = new ClassName();
		Student stud= new Student();	//Instantiation 
		//Here we have instantiated class Employee.
		
		stud.aceeptRecord( );	//emp.aceeptRecord( emp );	
		
		stud.printRecord( );		//emp.printRecord( emp );	
		
	}
}*/


	
