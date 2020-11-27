
import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collector;

public class StreamBuilders29 
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
 /*Now that we know some of the most powerful built-in collectors, let's try to build 
  * our own special collector. We want to transform all persons of the stream into a 
  * single string consisting of all names in upper letters separated by the | pipe character. 
  * In order to achieve this we create a new collector via Collector.of(). We have to pass the 
  * four ingredients of a collector: a supplier, an accumulator, a combiner and a finisher.
  */

    		Collector<Person, StringJoiner, String> personNameCollector =
    		    Collector.of(
    		        () -> new StringJoiner(" | "),          // supplier
    		        (j, p) -> j.add(p.name.toUpperCase()),  // accumulator
    		        (j1, j2) -> j1.merge(j2),               // combiner
    		        StringJoiner::toString);                // finisher

    		String names = persons
    		    .stream()
    		    .collect(personNameCollector);

    		System.out.println(names);  // MAX | PETER | PAMELA | DAVID
  /*Since strings in Java are immutable, we need a helper class like StringJoiner to let the 
   * collector construct our string. The supplier initially constructs such a StringJoiner 
   * with the appropriate delimiter. The accumulator is used to add each persons upper-cased 
   * name to the StringJoiner. The combiner knows how to merge two StringJoiners into one. In 
   * the last step the finisher constructs the desired String from the StringJoiner.
   */
     }
}