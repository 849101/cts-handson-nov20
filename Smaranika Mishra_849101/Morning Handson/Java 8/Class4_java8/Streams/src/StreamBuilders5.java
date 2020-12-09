import java.util.stream.IntStream;
import java.util.stream.Stream;

//In the given example, first, we are creating a stream from the characters of a given string. 
//In the second part, we are creating the stream of tokens received from splitting from a string.

public class StreamBuilders5 
{
     public static void main(String[] args)
     {
        IntStream stream = "12345_abcdefg".chars();
        stream.forEach(p -> System.out.println(p));
         
    //OR
         
        Stream<String> stream1 = Stream.of("A$B$C".split("\\$"));
        stream1.forEach(p -> System.out.println(p));
     }
}