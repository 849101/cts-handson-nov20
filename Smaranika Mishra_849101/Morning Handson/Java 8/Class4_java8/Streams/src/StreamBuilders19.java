//Streams can be created from various data sources, especially collections.
//Lists and Sets support new methods stream() and parallelStream() to either create
//a sequential or a parallel stream. Parallel streams are capable of 
//operating on multiple threads
import java.util.stream.Stream;

public class StreamBuilders19 
{
     public static void main(String[] args)
     {
    	 //An important characteristic of intermediate 
    	 //operations is laziness. Look at this sample where a terminal operation is missing:

    		 Stream.of("d2", "a2", "b1", "b3", "c")
    		     .filter(s -> {
    		         System.out.println("filter: " + s);
    		         return true;
    		     });
    		 //When executing this code snippet, nothing
    		 //is printed to the console. That is because intermediate
    		 //operations will only be executed when a terminal operation is present.
    		 //Let's extend the above example by the terminal operation forEach:

    		 Stream.of("d2", "a2", "b1", "b3", "c")
    		     .filter(s -> {
    		         System.out.println("filter: " + s);
    		         return true;
    		     })
    		     .forEach(s -> System.out.println("forEach: " + s));
    		 //The order of the result might be surprising.
    		/* A naive approach would be to execute the operations horizontally 
    		 one after another on all elements of the stream. But instead each 
    		 element moves along the chain vertically. 
    		 The first string "d2" passes filter then 
    		 forEach, only then the second string "a2" is processed.*/
    		 
     }
}