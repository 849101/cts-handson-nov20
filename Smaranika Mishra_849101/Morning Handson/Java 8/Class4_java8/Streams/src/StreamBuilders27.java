
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class StreamBuilders27 
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
    		//Collectors are extremely versatile. You can also create aggregations on the 
    		//elements of the stream, e.g. determining the average age of all persons:

    			Double averageAge = persons
    			    .stream()
    			    .collect(Collectors.averagingInt(p -> p.age));

    			System.out.println(averageAge);     // 19.0
    			//If you're interested in more comprehensive statistics, the summarizing 
    			//collectors return a special built-in summary statistics object. So we can 
    			//simply determine min, max and arithmetic average age of the persons as well as
    			//the sum and count.

    			IntSummaryStatistics ageSummary =
    			    persons
    			        .stream()
    			        .collect(Collectors.summarizingInt(p -> p.age));

    			System.out.println(ageSummary);
    			// IntSummaryStatistics{count=4, sum=76, min=12, average=19.000000, max=23}
     }
}