import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/*To enable parallelism, all we have to do is to create a parallel stream, 
instead of a sequential stream. And to surprise, this is really very easy.

In any of the above-listed stream examples, anytime we want to do a 
particular job using multiple threads in parallel cores, all we have to 
call parallelStream() method instead of stream() method.*/

public class StreamBuilders11
{
     public static void main(String[] args){
 
        List<Integer> list = new ArrayList<Integer>();
         for(int i = 1; i< 10; i++){
             list.add(i);
         }
          
        //Here creating a parallel stream
         Stream<Integer> stream = list.parallelStream();  
 
         Integer[] evenNumbersArr = stream.filter(i -> i%2 == 0).toArray(Integer[]::new);
         System.out.print(evenNumbersArr);
     }
}
