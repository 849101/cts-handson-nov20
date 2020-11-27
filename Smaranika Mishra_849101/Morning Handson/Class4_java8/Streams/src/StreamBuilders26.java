
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamBuilders26 
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
    		//Collect is an extremely useful terminal operation 
    		//to transform the elements of the stream into a different
    		//kind of result, e.g. a List, Set or Map. Collect accepts a Collector 
    		//which consists of four different operations: a supplier, an accumulator, a 
    		//combiner and a finisher. This sounds super complicated at first, but the good 
    		//part is Java 8 supports various built-in collectors via the Collectors class. 
    		//So for the most common operations you don't have to implement a collector yourself.

    		//Let's start with a very common usecase:

    		List<Person> filtered =
    		    persons
    		        .stream()
    		        .filter(p -> p.name.startsWith("P"))
    		        .collect(Collectors.toList());

    		System.out.println(filtered);    // [Peter, Pamela]
    		//As you can see it's very simple to construct a list from the 
    		//elements of a stream. Need a set instead of list - just use Collectors.toSet().
    		//The next example groups all persons by age:

    			Map<Integer, List<Person>> personsByAge = persons
    			    .stream()
    			    .collect(Collectors.groupingBy(p -> p.age));

    			personsByAge
    			    .forEach((age, p) -> System.out.format("age %s: %s\n", age, p));

     }
}