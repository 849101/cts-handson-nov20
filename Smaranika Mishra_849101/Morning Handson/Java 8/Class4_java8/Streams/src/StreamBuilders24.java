//Streams can be created from various data sources, especially collections.
//Lists and Sets support new methods stream() and parallelStream() to either create
//a sequential or a parallel stream. Parallel streams are capable of 
//operating on multiple threads
import java.util.stream.Stream;

public class StreamBuilders24 
{
     public static void main(String[] args)
     {
    	 //Once again we can optimize the performance by reordering the chain:

    		 Stream.of("d2", "a2", "b1", "b3", "c")
    		     .filter(s -> {
    		         System.out.println("filter: " + s);
    		         return s.startsWith("a");
    		     })
    		     .sorted((s1, s2) -> {
    		         System.out.printf("sort: %s; %s\n", s1, s2);
    		         return s1.compareTo(s2);
    		     })
    		     .map(s -> {
    		         System.out.println("map: " + s);
    		         return s.toUpperCase();
    		     })
    		     .forEach(s -> System.out.println("forEach: " + s));

    		 // filter:  d2
    		 // filter:  a2
    		 // filter:  b1
    		 // filter:  b3
    		 // filter:  c
    		 // map:     a2
    		 // forEach: A2
    		 /*In this example sorted is never been called because
    		  *  filter reduces the input collection to just one element. 
    		  *  So the performance is greatly increased for larger input collections.
    		  */
     }
}