import java.util.Scanner;

public class Fibonacci {

	
	public static void main(String[] args) {
		int z;
		
		System.out.println("Quantos elementos?");
		
		Scanner s = new Scanner(System.in);
		
		z = s.nextInt();
		
	
		int[] fibo = new int [z];
		fibo[0] = 0;
		fibo[1] = 1;
		System.out.println(fibo[0]);
		System.out.println(fibo[1]);
		double total = 0;
		double average = 0;
		
		for (int i = 2; i < fibo.length; i++){
		
			fibo[i] = fibo[i-2] + fibo[i-1];
//			System.out.println(i);
			total += fibo[i];
			 
			System.out.println(fibo[i]);
			
		}
		
		total = total + fibo[0] + fibo[1];
		average = ((double)total/z);
		System.out.println("A soma é:" + total);
		System.out.println("A média é:" + average);
	}

}
