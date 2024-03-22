package in.com;

public class asgn7_5 {

	public static void main(String[] args) {
		int arr[] = { 24, 54, 31, 16, 82, 45, 67 };
		int small = arr[0];
		int large = arr[0];// compare sathi

		for (int i = 1; i < arr.length; i++) { //
			if (arr[i] < small)
			{
				small = arr[i]; // 16 get store in small
			}
			if (arr[i] > large) {
				large = arr[i];
			}
		}
		System.out.println("small number : " + small);
		System.out.println("large number : " + large);
	}
}
