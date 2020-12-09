//Streams can be created from various data sources, especially collections.
//Lists and Sets support new methods stream() and parallelStream() to either create
//a sequential or a parallel stream. Parallel streams are capable of 
//operating on multiple threads
import java.util.stream.Stream;

public class StreamBuilders14 
{
     public static void main(String[] args)
     {
    	 //But we don't have to create collections in order to 
    	 //work with streams as we see in the next code sample:

    	 Stream.of("a1", "a2", "a3")
    	     .findFirst()
    	     .ifPresent(System.out::println);  // a1
    	 //Just use Stream.of() to create a stream from a bunch of object references.

     }
}