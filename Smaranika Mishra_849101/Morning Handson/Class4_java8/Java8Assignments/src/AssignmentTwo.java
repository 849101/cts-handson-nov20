import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/* 2. Give a ArrayList of Players -  List<Player> . Take a Player pojo with String Name, Int age, and Int
  *  runs. Build a list using list.add.
           a. Find the first player whose age is less than 30 and Runs greater than 5000 and print the name. or else print
            "No player selected for world cup"
           b. For the same example find first 3 players and result should be a new list with three players.*/
public class AssignmentTwo {

	public static void main(String[] args) {
		class Player {
			String name;
			int age;
			int runs;

			Player(String name, int age, int runs) {
				this.name = name;
				this.age = age;
				this.runs = runs;
			}

			@Override
			public String toString() {
				return name;
			}
		}

		List<Player> players =
		    Arrays.asList(
		        new Player("Max", 18,6002),
		        new Player("Peter", 23,6520),
		        new Player("Pamela", 24,4500),
		        new Player("David", 12,6522),
		        new Player("Pam",31,4500),
		        new Player("Dave",33,6522),
				new Player("Dive",21,6521));
		
		List<Player> filtered =
			    players
			        .stream()
			        .filter(p -> p.age <30 && p.runs>5000)
			        .collect(Collectors.toList());
		if(filtered.isEmpty()) {
			System.out.println("No player selected for world cup");
		}
		else {
			System.out.println(filtered); //Printing all the elements on the above conditions.
			Player First = players.stream().findFirst().get();
			System.out.println(First);  //printing the first elment
			List<Player> Three=filtered.parallelStream().
					limit(3)
					.collect(Collectors.toList());
			System.out.println(Three);
		}
		
		 
	}

}
