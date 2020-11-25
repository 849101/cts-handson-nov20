package Class2_java8;

public class ThreadDemo {

	public static void main(String[] args) {

		Counter counter=new Counter();
		Thread t1=new Thread(counter);
		Thread t2=new Thread(counter);
		t1.start();
		t2.start();
	}

}
