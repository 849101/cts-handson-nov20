package MethodandConstructorReferences;

public class Example2 {
	
	
		//Let's see how the :: keyword works for constructors. First we define an example bean with different constructors:

		class Person {
		    String firstName;
		    String lastName;

		    Person() {}

		    Person(String firstName, String lastName) {
		        this.firstName = firstName;
		        this.lastName = lastName;
		    }
		}
		//Next we specify a person factory interface to be used for creating new persons:

		interface PersonFactory<P extends Person> {
		    P create(String firstName, String lastName);
		}
		//Instead of implementing the factory manually, we glue everything together via constructor references:
		
			
		PersonFactory<Person> personFactory = Person::new;
		Person person = personFactory.create("Peter", "Parker");
		//We create a reference to the Person constructor via Person::new. The Java compiler automatically
		//chooses the right constructor by matching the signature of PersonFactory.create.
		

}
