package Class1;

import java.util.ArrayList;
import java.util.List;

public class First_handson1 {
 
	public static void main(String[] args) {
		List<First_handson> list = new ArrayList<First_handson>();
		list.add(new First_handson(555, "Alex", "alex1234"));
		list.add(new First_handson(666, "Bravo", "bravo1234"));
		list.add(new First_handson(777, "Charles", "charles124"));
		list.add(new First_handson(888, "David", "david123"));
		list.add(new First_handson(999, "Edward", "edward123"));
		
		for(First_handson user : list) {
			if(user.getName().length() > 5) {
				System.out.println("Id = "+user.getId()+", Name = "+user.getName());
			}
		}

	}
}
