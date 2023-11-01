package array;

public class quiz5 {

	public static void main(String[] args) {
		int[] arr = {5,20,100,30,77};
		int num = 0;
		
		
		for(int i = 0; i < arr.length-1; i++) {
			if(arr[i] > arr[i+1]) {
				num = arr[i];
			}
		}
		System.out.println(num);

	}

}
