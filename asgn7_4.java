package in.com;

public class asgn7_4 {

	public static void main(String[] args) {
		int arr[]= new int[] {1,2,3,4};
		System.out.println("Orignal array : ");
	   for(int i = 0; i < arr.length; i++) {
		   System.out.println(arr[i]);
	   }
	   System.out.println();
   System.out.println("Reverse array : ");
	   for(int i=arr.length-1; i >= 0 ; i-- ) {
	    	System.out.println(arr[i]);
	    }
	
	}

}
