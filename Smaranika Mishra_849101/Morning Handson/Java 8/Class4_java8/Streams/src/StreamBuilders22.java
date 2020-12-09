//Streams can be created from various data sources, especially collections.
//Lists and Sets support new methods stream() and parallelStream() to either create
//a sequential or a parallel stream. Parallel streams are capable of 
//operating on multiple threads
import java.util.stream.Stream;

public class StreamBuilders22 
{
     public static void main(String[] args)
     {
    	/* We can greatly reduce the actual number of executions if we change the order 
    	 of the operations, moving filter to the beginning of the chain:*/

    		 Stream.of("d2", "a2", "b1", "b3", "c")
    		     .filter(s -> {
    		         System.out.println("filter: " + s);
    		         return s.startsWith("a");
    		     })
    		     .map(s -> {
    		         System.out.println("map: " + s);
    		         return s.toUpperCase();
    		     })
    		     .forEach(s -> System.out.println("forEach: " + s));

    		 // filter:  d2
    		 // filter:  a2
    		 // map:     a2
    		 // forEach: A2
    		 // filter:  b1
    		 // filter:  b3
    		 // filter:  c
    		/* Now, map is only called once so the operation pipeline 
    		 * performs much faster for larger numbers of input elements. Keep
    		 *  that in mind when composing complex method chains.
    		 */
     }
}