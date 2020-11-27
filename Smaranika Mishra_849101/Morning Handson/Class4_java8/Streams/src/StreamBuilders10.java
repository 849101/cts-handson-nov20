
//Terminal Operation.
import java.util.ArrayList;
import java.util.List;

/*Terminal operations return a result of a certain type after processing all the stream elements.

Once the terminal operation is invoked on a Stream, 
the iteration of the Stream and any of the chained streams will get started. 
Once the iteration is done, the result of the terminal operation is returned.*/
public class StreamBuilders10 {
	public static void main(String[] args) {
		List<String> memberNames = new ArrayList<>();
		memberNames.add("Amitabh");
		memberNames.add("Shekhar");
		memberNames.add("Aman");
		memberNames.add("Rahul");
		memberNames.add("Shahrukh");
		memberNames.add("Salman");
		memberNames.add("Yana");
		memberNames.add("Lokesh");
		// The anyMatch() will return true once a condition passed as predicate
		// satisfies.
		// Once a matching value is found, no more elements will be processed in the
		// stream.
		// In the given example, as soon as a String is found starting with the letter
		// 'A',
		// the stream will end and the result will be returned.
		boolean matched = memberNames.stream().anyMatch((s) -> s.startsWith("A"));

		System.out.println(matched);
		// The findFirst() method will return the first element
		// from the stream and then it will not process any more elements.

		String firstMatchedName = memberNames.stream().filter((s) -> 
		s.startsWith("L")).findFirst().get();

		System.out.println(firstMatchedName);
		
	}
}