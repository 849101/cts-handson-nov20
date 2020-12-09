//Streams can be created from various data sources, especially collections.
//Lists and Sets support new methods stream() and parallelStream() to either create
//a sequential or a parallel stream. Parallel streams are capable of 
//operating on multiple threads
import java.util.Arrays;

public class StreamBuilders13 
{
     public static void main(String[] args)
     {
    	 Arrays.asList("a1", "a2", "a3")
    	    .stream()
    	    .findFirst()
    	    .ifPresent(System.out::println);  // a1
    	//Calling the method stream() on a list of objects returns a regular object stream.

     }
}