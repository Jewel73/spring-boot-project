
public class FibonacciNumber {

	public static void main(String[] args) {
		int count =7, num1=0, num2=1;
		
		for (int i = 0; i < count; i++) {
			int	sumOfPrv=num1+num2;
			System.out.println(num1);
			num1=num2;
			num2=sumOfPrv;
			
		}

	}

}
