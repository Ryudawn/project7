package ArrayList;

import java.util.ArrayList;

public class quiz2 {

	public static void main(String[] args) {

		ArrayList<Boolean> list = new ArrayList<Boolean>();
		
		list.add(true);
		list.add(true);
		list.add(false);
		
		for(int i = 0; i < list.size(); i++) {
			boolean a = list.get(i);
			System.out.print(a+ " ");
			if(i == list.size()-1) {
				System.out.println( );
			if(i == list.size()-1 || i ==0) {
				boolean b = list.get(0);
				boolean c = list.get(list.size()-1);
				System.out.println(b +","+ c);
			}
			}
		}
		
	}

}
