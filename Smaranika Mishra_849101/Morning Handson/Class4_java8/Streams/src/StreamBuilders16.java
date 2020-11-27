//Streams can be created from various data sources, especially collections.
//Lists and Sets support new methods stream() and parallelStream() to either create
//a sequential or a parallel stream. Parallel streams are capable of 
//operating on multiple threads
import java.util.Arrays;

public class StreamBuilders16 
{
     public static void main(String[] args)
     {
    	 /*All those primitive streams work just like regular 
    	 object streams with the following differences: Primitive streams 
    	 use specialized lambda expressions, e.g. IntFunction instead of 
    	 Function or IntPredicate instead of Predicate.
    	 And primitive streams support the additional terminal aggregate
    	 operations sum() and average():*/
    	 Arrays.stream(new int[] {1, 2, 3})
    	    .map(n -> 2 * n + 1)
    	    .average()
    	    .ifPresent(System.out::println);  // 5.0

     }
}