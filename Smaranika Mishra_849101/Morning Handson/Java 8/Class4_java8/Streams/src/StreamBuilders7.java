import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/*The given example is similar to the first example shown above. 
The only difference is that we are collecting the even numbers in an Array.*/

public class StreamBuilders7 
{
     public static void main(String[] args)
     {
         List<Integer> list = new ArrayList<Integer>();
 
         for(int i = 1; i< 10; i++){
             list.add(i);
         }
 
         Stream<Integer> stream = list.stream();
         Integer[] evenNumbersArr = stream.filter(i -> i%2 == 0).toArray(Integer[]::new);
         System.out.print(Arrays.deepToString(evenNumbersArr));
         
     }
}