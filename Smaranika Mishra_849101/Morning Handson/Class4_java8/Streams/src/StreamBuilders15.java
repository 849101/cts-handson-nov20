//Streams can be created from various data sources, especially collections.
//Lists and Sets support new methods stream() and parallelStream() to either create
//a sequential or a parallel stream. Parallel streams are capable of 
//operating on multiple threads
import java.util.stream.IntStream;

public class StreamBuilders15 
{
     public static void main(String[] args)
     {
    	 //Besides regular object streams Java 8 
    	 //ships with special kinds of streams for working
    	 //with the primitive data types int, long and double. 
    	 //As you might have guessed it's IntStream, LongStream and DoubleStream.

    	 //IntStreams can replace the regular for-loop utilizing IntStream.range():

    	 IntStream.range(1, 4)
    	     .forEach(System.out::println);

    	 // 1
    	 // 2
    	 // 3

     }
}