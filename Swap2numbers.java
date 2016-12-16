import java.util.Scanner;


public class Swap2numbers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 1st number");
		int a= scan.nextInt();
		System.out.println("Enter 2nd number");
		int b= scan.nextInt();
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("Enter 1st number="+a);
		System.out.println("Enter 2nd number="+b);
		
	}

}
