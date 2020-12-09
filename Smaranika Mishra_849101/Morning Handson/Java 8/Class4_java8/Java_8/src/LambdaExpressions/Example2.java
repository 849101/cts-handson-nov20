package LambdaExpressions;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Example2 {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("peter", "anna", "mike", "xenia");

		/*Instead of creating anonymous objects all day long, Java 8 comes with
		 *  a much shorter syntax, lambda expressions:
		 */

			Collections.sort(names, (String a, String b) -> {
			    return b.compareTo(a);
			});
			System.out.println(names);
			/*As you can see the code is much shorter and easier to read. 
			 * But it gets even shorter:
			 */

			Collections.sort(names, (String a, String b) -> b.compareTo(a));
			System.out.println(names);
			/*For one line method bodies you can skip both the braces {} 
			 * and the return keyword. But it gets even more shorter:
			 */

			Collections.sort(names, (a, b) -> b.compareTo(a));
			System.out.println(names);
		/*The static utility method Collections.sort accepts a list and a
		 *  comparator in order to sort the elements of the given list.
		 */

	}

}
