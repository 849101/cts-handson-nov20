import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Stream;

/*In the given example, we are creating a stream from generated elements. 
This will produce a stream of 20 random numbers. 
We have restricted the elements count using limit() function.*/
public class StreamBuilders4 
{
     public static void main(String[] args)
     {
         Stream<Integer> randomNumbers = Stream
             .generate((Supplier<Integer>) () -> (new Random()).nextInt(100));
 
         randomNumbers.limit(20)
              .forEach(System.out::println);
     }
}