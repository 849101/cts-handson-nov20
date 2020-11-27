//Streams can be created from various data sources, especially collections.
//Lists and Sets support new methods stream() and parallelStream() to either create
//a sequential or a parallel stream. Parallel streams are capable of 
//operating on multiple threads
import java.util.stream.Stream;

public class StreamBuilders18 
{
     public static void main(String[] args)
     {
    	// Here's a combined example: the stream of doubles 
    	 //is first mapped to an int stream and than mapped to an object stream of strings:

    	 Stream.of(1.0, 2.0, 3.0)
    	     .mapToInt(Double::intValue)
    	     .mapToObj(i -> "a" + i)
    	     .forEach(System.out::println);

    	 // a1
    	 // a2
    	 // a3
     }
}