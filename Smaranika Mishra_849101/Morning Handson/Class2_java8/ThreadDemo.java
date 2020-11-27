package Class2_java8;

public class ThreadDemo {

	public static void main(String[] args) {

		Counter counter=new Counter();
		Thread t1=new Thread(counter,"A");
		Thread t2=new Thread(counter,"B");
		t1.start();
		t2.start();
		System.out.println("End of the program");

	}

}
