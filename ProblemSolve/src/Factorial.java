
public class Factorial {

	public static void main(String[] args) {
			int fact=5;	
			int sum=1;
		for (int i = 5; i >=1; i--) {
			System.out.println(i);
			fact=fact+i;
			 sum=sum*fact;
		}
		System.out.println(sum);

	}

}
