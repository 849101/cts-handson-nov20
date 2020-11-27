
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamBuilders28 
{
     public static void main(String[] args)
     {
    	 class Person {
    		    String name;
    		    int age;

    		    Person(String name, int age) {
    		        this.name = name;
    		        this.age = age;
    		    }

    		    @Override
    		    public String toString() {
    		        return name;
    		    }
    		}

    		List<Person> persons =
    		    Arrays.asList(
    		        new Person("Max", 18),
    		        new Person("Peter", 23),
    		        new Person("Pamela", 23),
    		        new Person("David", 12));
    		//The next example joins all persons into a single string:

    			String phrase = persons
    			    .stream()
    			    .filter(p -> p.age >= 18)
    			    .map(p -> p.name)
    			    .collect(Collectors.joining(" and ", "In Germany ", " are of legal age."));

    			System.out.println(phrase);
    			// In Germany Max and Peter and Pamela are of legal age.
   //The join collector accepts a delimiter as well as an optional prefix and suffix.

   //In order to transform the stream elements into a map, we have to specify how both the
  //keys and the values should be mapped. Keep in mind that the mapped keys must be unique, 
  //otherwise an IllegalStateException is thrown. You can optionally pass a merge function 
   //as an additional parameter to bypass the exception:

    			Map<Integer, String> map = persons
    			    .stream()
    			    .collect(Collectors.toMap(
    			        p -> p.age,
    			        p -> p.name,
    			        (name1, name2) -> name1 + ";" + name2));

    			System.out.println(map);
    			// {18=Max, 23=Peter;Pamela, 12=David}
     }
}