import java.util.stream.Stream;//Inputting array of integer type in a string

public class StreamBuilders2 
{
     public static void main(String[] args)
     {
         Stream<Integer> stream = Stream.of( new Integer[]{1,2,3,4,5,6,7,8,9} );
         stream.forEach(p -> System.out.println(p));//custom type loop.
         Stream<String> stream1 = Stream.of( new String[]{"Smaranika","Mishra"} );
         stream1.forEach(p -> System.out.println(p));
        
     }
}