package JW;

import java.util.HashMap;
import java.util.Map;

public class Hashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer,String> nHp = new HashMap<Integer,String>();
		
		nHp.put(1, "Leo");
		nHp.put(2, "Travi");
		nHp.put(3, "Jhon");
		nHp.put(4, "Lira");
		nHp.put(5, "Mexi");
		
//		System.out.println(nHp.size());
//		System.out.println(nHp.get(300));
		
		try {
			for(Map.Entry<Integer, String> entry : nHp.entrySet()) {
				
				Integer key = entry.getKey();
				String values = entry.getValue();
				System.out.println("(Key of " +key + " value is : " +values +")");
				//nHp.remove(4);
				
			}
		}
		
		catch(Exception e) {
			System.out.println("Sorry");
		}
		
		
			
		

	}

}
