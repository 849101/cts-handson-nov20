package Class2_java8;

public class ThreadDemo1 {

	public static void main(String[] args) {

		Counter1 counter=new Counter1();
		Thread t1=new Thread(counter,"1");
		Thread t2=new Thread(counter,"2");
		t1.start();
		t2.start();
		System.out.println("End of the program");
	}

}
