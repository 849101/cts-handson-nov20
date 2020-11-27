//Streams can be created from various data sources, especially collections.
//Lists and Sets support new methods stream() and parallelStream() to either create
//a sequential or a parallel stream. Parallel streams are capable of 
//operating on multiple threads
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamBuilders17 
{
     public static void main(String[] args)
     {
    	// Sometimes it's useful to transform a 
    	 //regular object stream to a primitive stream or vice versa.
    	 //For that purpose object streams support the special mapping 
    	 //operations mapToInt(), mapToLong() and mapToDouble:

    	 Stream.of("a1", "a2", "a3")
    	     .map(s -> s.substring(1))
    	     .mapToInt(Integer::parseInt)
    	     .max()
    	     .ifPresent(System.out::println);  // 3
    	// Primitive streams can be transformed to object streams via mapToObj():

    		 IntStream.range(1, 4)
    		     .mapToObj(i -> "a" + i)
    		     .forEach(System.out::println);

    		 // a1
    		 // a2
    		 // a3

     }
}