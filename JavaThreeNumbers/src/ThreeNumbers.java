import java.util.Scanner;

public class ThreeNumbers {
	
	
	public static int sum(int n1,int n2,int n3) {
		return n1+n2+n3;
	}
		
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first no:");
		int n1 = sc.nextInt();
		
		System.out.println("Enter second no:");
		int n2 = sc.nextInt();
		
		System.out.println("Enter third no:");
		int n3 = sc.nextInt();

		
		System.out.println(sum(n1,n2,n3));
	}

}
