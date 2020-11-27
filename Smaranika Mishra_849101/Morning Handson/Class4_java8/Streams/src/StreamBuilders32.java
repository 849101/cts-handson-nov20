
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ForkJoinPool;

public class StreamBuilders32 
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
    		Arrays.asList("a1", "a2", "b1", "c2", "c1")
    	    .parallelStream()
    	    .filter(s -> {
    	        System.out.format("filter: %s [%s]\n",
    	            s, Thread.currentThread().getName());
    	        return true;
    	    })
    	    .map(s -> {
    	        System.out.format("map: %s [%s]\n",
    	            s, Thread.currentThread().getName());
    	        return s.toUpperCase();
    	    })
    	    .sorted((s1, s2) -> {
    	        System.out.format("sort: %s <> %s [%s]\n",
    	            s1, s2, Thread.currentThread().getName());
    	        return s1.compareTo(s2);
    	    })
    	    .forEach(s -> System.out.format("forEach: %s [%s]\n",
    	        s, Thread.currentThread().getName()));
     }
}