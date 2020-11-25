package Class2_java8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestMap
{

public static void main(String[] args)
{
// TODO Auto-generated method stub
Map<String, List<String>> map= new HashMap<String, List<String>>();
List<String> One = new ArrayList<String>();
One.add("Trupti");
One.add("Ayushi");
One.add("Smaranika");

List<String> Two = new ArrayList<String>();
Two.add("Ram");
Two.add("Rani");
Two.add("Rajesh");

map.put("CS", One);
map.put("ECE", Two);

System.out.println("Fetching Keys and their values");
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            String key = entry.getKey();
            List<String> values = entry.getValue();
            System.out.println("Key = " + key);
            System.out.println("Values = " + values );

}

}
}