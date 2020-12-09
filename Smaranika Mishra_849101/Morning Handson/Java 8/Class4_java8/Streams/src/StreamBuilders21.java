//Streams can be created from various data sources, especially collections.
//Lists and Sets support new methods stream() and parallelStream() to either create
//a sequential or a parallel stream. Parallel streams are capable of 
//operating on multiple threads
import java.util.stream.Stream;

public class StreamBuilders21 
{
     public static void main(String[] args)
     {
    	 /*The next example consists of two intermediate operations
    	 map and filter and the terminal operation forEach. Let's once again inspect
    	 how those operations are being executed:*/

    	 Stream.of("d2", "a2", "b1", "b3", "c")
    	     .map(s -> {
    	         System.out.println("map: " + s);
    	         return s.toUpperCase();
    	     })
    	     .filter(s -> {
    	         System.out.println("filter: " + s);
    	         return s.startsWith("A");
    	     })
    	     .forEach(s -> System.out.println("forEach: " + s));

    	 // map:     d2
    	 // filter:  D2
    	 // map:     a2
    	 // filter:  A2
    	 // forEach: A2
    	 // map:     b1
    	 // filter:  B1
    	 // map:     b3
    	 // filter:  B3
    	 // map:     c
    	 // filter:  C
    	 /*As you might have guessed both map and filter are called five times 
    	 for every string in the underlying collection whereas forEach is only called once.	 */
     }
}