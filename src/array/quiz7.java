package array;

public class quiz7 {

	public static void main(String[] args) {

		char[] arr = {'a','b','c','d','e'};
		char[] arr2 = new char[2];
		
		System.arraycopy(arr, 3, arr2, 0, 2);
		
		for(int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i]);
		}
		
		
		
	}

}
