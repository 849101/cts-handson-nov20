package DefaultMethodsOrInterfaces;

public class main_m {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Formula formula = new Formula() {
		    @Override
		    public double calculate(int a) {
		        return sqrt(a * 100);
		    }
		};

		     
		   
		System.out.println(formula.calculate(100));// 100.0
		System.out.println(formula.sqrt(16));
	}

}
