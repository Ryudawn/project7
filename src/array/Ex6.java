package array;

public class Ex6 {

	public static void main(String[] args) {
		char[] srcArr = {'a','b','c','d','e'};
		char[] newArr = new char[3];
		
		System.arraycopy(srcArr, 0, newArr, 0, 3);
		
		System.out.print("원본 배열 : ");
		for(int i = 0; i < srcArr.length; i++) {
			System.out.print(srcArr[i]);
		}
		
		System.out.print("새로운 배열: ");
		for(int i = 0; i < newArr.length; i++) {
			System.out.print(newArr[i] + " ");
		}
		

	}

}
