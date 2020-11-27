
/* Given an ArrayList of companies - Lenovo, Dell, Acer, Samsung, Oppo,
 *  Oneplus, HTC, Intel, null, Microsoft, Jetbrains, Titan, Fossil. 
 *   Use list.add keyword to build a list with these values.
            a. Using the streams API, filter out nulls (use method reference)
            b. Filter companies which has length more than 4 (Lamda expression)
            c. Transform them to UPPERCASE. 
            c. Sort them alphabetically
            d. Result should be a new list with filtered values.*/

     
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class AssignmentOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> memberNames = new ArrayList<>();
		memberNames.add("Lednovo");
		memberNames.add("Dell");
		memberNames.add("Accer");
		memberNames.add("Smasung");
		memberNames.add("Oppo");
		memberNames.add("Oneplus");
		memberNames.add("HTC");
		memberNames.add("Intel");
		memberNames.add(null);
		memberNames.add("Microsoft");
		memberNames.add("Jetbrains");
		memberNames.add("Titan");
		memberNames.add("Fossil");
		
		
		List<String> finalList = memberNames.stream().filter(str -> str != null && str.length() > 4)
		.map(String::toUpperCase).sorted()
		.collect(Collectors.toList());
		
		 System.out.print(finalList);
		
		
		
	}

}
