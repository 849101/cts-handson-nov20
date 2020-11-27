//Intermediate Operations
import java.util.ArrayList;
import java.util.List;

public class StreamBuilders8 
{
     public static void main(String[] args)
     {
    	 List<String> memberNames = new ArrayList<>();
    	 memberNames.add("Amitabh");
    	 memberNames.add("Shekhar");
    	 memberNames.add("Aman");
    	 memberNames.add("Rahul");
    	 memberNames.add("Shahrukh");
    	 memberNames.add("Salman");
    	 memberNames.add("Yana");
    	 memberNames.add("Lokesh");
    	 //Intermediate operations return 
    	 //the stream itself so you can chain multiple methods calls in a row.
    	 //The filter() method accepts a Predicate to filter all elements of the stream. 
    	 //This operation is intermediate which enables 
    	 //us to call another stream operation (e.g. forEach()) on the result.
    	 memberNames.stream().filter((s) -> s.startsWith("A"))
         .forEach(System.out::println);
    	 //The map() intermediate operation converts each element 
    	 //in the stream into another object via the given function.
    	 //The following example converts each string into an UPPERCASE string.
    	 //But we can use map() to transform an object into another type as well.
    	 memberNames.stream().filter((s) -> s.startsWith("A"))
         .map(String::toUpperCase)
         .forEach(System.out::println);
    	 //The sorted() method is an intermediate operation that returns a 
    	 //sorted view of the stream. 
    	 //The elements in the stream are sorted in natural
    	 //order unless we pass a custom Comparator.
    	 memberNames.stream().sorted()
         .map(String::toUpperCase)
         .forEach(System.out::println);
    	 //Please note that the sorted() method only creates a sorted 
    	 //view of the stream without manipulating the ordering 
    	 //of the source Collection. In this example, 
    	 //the ordering of string in the memberNames is untouched.
     }
}