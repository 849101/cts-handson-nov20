
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ForkJoinPool;

public class StreamBuilders33 
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
    		ForkJoinPool commonPool = ForkJoinPool.commonPool();
    		System.out.println(commonPool.getParallelism());  
    		List<Person> persons1 = Arrays.asList(
    			    new Person("Max", 18),
    			    new Person("Peter", 23),
    			    new Person("Pamela", 23),
    			    new Person("David", 12));

    			persons1
    			    .parallelStream()
    			    .reduce(0,
    			        (sum, p) -> {
    			            System.out.format("accumulator: sum=%s; person=%s [%s]\n",
    			                sum, p, Thread.currentThread().getName());
    			            return sum += p.age;
    			        },
    			        (sum1, sum2) -> {
    			            System.out.format("combiner: sum1=%s; sum2=%s [%s]\n",
    			                sum1, sum2, Thread.currentThread().getName());
    			            return sum1 + sum2;
    			        });
     }
}