import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		System.out.println(fibonacci(input));
	}
	public static int fibonacci(int n) {
		if(n <= 1) return n;
		return n + fibonacci(n-1);
		
	}
}
