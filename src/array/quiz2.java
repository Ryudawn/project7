package array;

public class quiz2 {
 public static void main(String[] args) {
	 int[] arr = new int[10];
	 
	 for(int i = 0; i < arr.length; i++  ) {
		 arr[i] = i+1;
		 if (i == 0 || i == arr.length-1) {
			 System.out.println(arr[i]);
		 }
	 }
	 
 }
}
