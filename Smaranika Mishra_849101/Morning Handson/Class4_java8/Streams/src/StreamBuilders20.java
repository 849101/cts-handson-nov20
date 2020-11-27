//Streams can be created from various data sources, especially collections.
//Lists and Sets support new methods stream() and parallelStream() to either create
//a sequential or a parallel stream. Parallel streams are capable of 
//operating on multiple threads
import java.util.stream.Stream;

public class StreamBuilders20 
{
     public static void main(String[] args)
     {
    	 //This behavior can reduce the actual number of 
    	 //operations performed on each element, as we see in the next example:

    		 Stream.of("d2", "a2", "b1", "b3", "c")
    		     .map(s -> {
    		         System.out.println("map: " + s);
    		         return s.toUpperCase();
    		     })
    		     .anyMatch(s -> {
    		         System.out.println("anyMatch: " + s);
    		         return s.startsWith("A");
    		     });

    		 // map:      d2
    		 // anyMatch: D2
    		 // map:      a2
    		 // anyMatch: A2
    		 /*The operation anyMatch returns true as 
    		 soon as the predicate applies to the given input element. 
    		 This is true for the second element passed "A2". Due to the vertical 
    		 execution of the stream chain, map has only to be executed twice in this case.
    		 So instead of mapping all elements of the stream, map will be called as few
    		 as possible.*/
     }
}