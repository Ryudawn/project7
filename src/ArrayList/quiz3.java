package ArrayList;

import java.util.ArrayList;

public class quiz3 {

	public static void main(String[] args) {
		ArrayList<String> list =  new ArrayList<String>();
		list.add("AA");
		list.add("BB");
		list.add("CC");
		list.add("DD");
		
		for(int i = 0; i < list.size(); i++) {
			String a = list.get(i);
			System.out.println(a);
			if(i == list.size()-1) {
				
				list.removeAll(list);
				
				
			}
		}
		System.out.println(list);
	}

}
