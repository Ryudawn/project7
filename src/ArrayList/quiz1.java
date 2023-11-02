package ArrayList;

import java.util.ArrayList;

public class quiz1 {

	public static void main(String[] args) {

		ArrayList<Character> list = new ArrayList<Character>();
		
		list.add('A');
		list.add('B');
		list.add('C');
		
		for(int i = 0; i < list.size(); i++) {
			char a = list.get(i);
			System.out.print(a + " ");
		}
	}

}
