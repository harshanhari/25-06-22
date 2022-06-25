package home_work;

import java.util.Scanner;

public class Ques5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numbers to compute :- ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int sum = a + b;
		int sub = a - b;
		int pro = a * b;
		int div = a / b;
		System.out.print("The sum is " + sum + "\nThe product is " + pro + "\nThe difference is " + sub
				+ "\nThe quotient is" + div);
	}

}
