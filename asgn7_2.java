package in.com;

public class asgn7_2 {

	public static void main(String[] args) {
		int arr1[]= {1, 2, 3, 4};
		int arr2[]= {1, 2, 3, 4, 5, 6};
		boolean result = false;
		if (arr1.length == arr2.length) {
			for(int i = 0; i<= arr1.length;i++) {
				{
					if(arr1[i]!= arr2[i]) {
						result= false;
					}
					}
			}
		}
			else {
				result= true;
				
			}
			if(result== true) {
				System.out.println("Two are equal");
			}
			}
	}


