
import java.util.function.Supplier;
import java.util.stream.Stream;

public class StreamBuilders25 
{
     public static void main(String[] args)
     {
    	 //Java 8 streams cannot be reused. As soon as you call any 
    	 //terminal operation the stream is closed:

    		 /*Stream<String> stream =
    		     Stream.of("d2", "a2", "b1", "b3", "c")
    		         .filter(s -> s.startsWith("a"));

    		 stream.anyMatch(s -> true);    // ok
    		 stream.noneMatch(s -> true);   // exception*/
    		 //Calling noneMatch after anyMatch on the same stream results in the 
    		 //following exception
    		 //To overcome this limitation we have to to create a new stream 
    		 //chain for every terminal operation we want to execute, e.g. we could create
    		 //a stream supplier to construct a new stream with all intermediate operations
    		 //already set up:

    			 Supplier<Stream<String>> streamSupplier =
    			     () -> Stream.of("d2", "a2", "b1", "b3", "c")
    			             .filter(s -> s.startsWith("a"));

    			 streamSupplier.get().anyMatch(s -> true);   // ok
    			 streamSupplier.get().noneMatch(s -> true);  // ok
    			 //Each call to get() constructs a new stream on which we are
    			// save to call the desired terminal operation.
     }
}