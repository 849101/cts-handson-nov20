//Accessing outer scope variables from lambda expressions is very similar to anonymous objects. You can access 
//final variables from the local outer scope as well as instance fields and static variables.
package LambdaScopes;

public class Example1 {
	@FunctionalInterface
	interface Converter<F, T> {
	    T convert(F from);
	}
	public static void main(String[] args) {
		//Accessing local variables#
		//We can read final local variables from the outer scope of lambda expressions:

		final int num = 1;
		Converter<Integer, String> stringConverter =
		        (from) -> String.valueOf(from + num);

		System.out.println(stringConverter.convert(2));     // 3
		//But different to anonymous objects the variable num does not have to be declared final. This code is also valid:

		int num1 = 1;
		Converter<Integer, String> stringConverter1 =
		        (from) -> String.valueOf(from + num1);

		System.out.println(stringConverter1.convert(2));     // 3
		//However num must be implicitly final for the code to compile. The following code does not compile:

		/*int num11 = 1;
		Converter<Integer, String> stringConverter2 =
		        (from) -> String.valueOf(from + num11);
		num11 = 3;*/
		//Writing to num from within the lambda expression is also prohibited.
	}

}
