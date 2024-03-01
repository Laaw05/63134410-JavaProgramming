package Lab3Bai1;

import java.util.Scanner;

public class MainBai1 {
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		System.out.print("Nhap so nguyen duong: ");
		int number= scanner.nextInt();
		
		PrimeNumberChecker primeChecker= new PrimeNumberChecker();
		boolean isPrime = primeChecker.isPrime(number);
		
		if(isPrime)
			System.out.println(number+" la so nguyen to");
		else
			System.out.println("Khong phai so nguyen to");
	}
}
