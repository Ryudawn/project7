package array;

public class quiz3 {

	public static void main(String[] args) {
		int[] arr = new int[5];
		int sum = 0;
		
		for(int i = 0; i <arr.length; i++) {
			
			arr[i] = (i+1) * 5 + 5;
			sum += arr[i]; 
			
		}
		System.out.println(sum);
	}

}
