package MethodandConstructorReferences;

public class Example1 {
	@FunctionalInterface
	interface Converter<F, T> {
	    T convert(F from);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Converter<String, Integer> converter = Integer::valueOf;
		Integer converted = converter.convert("123");
		System.out.println(converted);   // 123
		/*Java 8 enables you to pass references of methods or constructors 
		 * via the :: keyword. The above example shows how to reference a 
		 * static method. But we can also reference object methods:
		 */

		class Something {
		    String startsWith(String s) {
		        return String.valueOf(s.charAt(0));
		    }
		}
		Something something = new Something();
		Converter<String, String> converter1 = something::startsWith;
		String converted1 = converter1.convert("Java");
		System.out.println(converted1);    // "J"
	}

}
