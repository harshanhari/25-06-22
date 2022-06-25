package home_work;

import java.util.Scanner;

public class Ques7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter three numbers :- ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int sum = a + b + c;
		double avg = (a + b + c) / 3;
		int pro = a * b * c;
		int l = (a > b) ? (a > c ? a : c) : (b > c ? b : c);
		int s = (a < b) ? (a < c ? a : c) : (b < c ? b : c);
		System.out.println("The sum is : " + sum);
		System.out.println("The avarge is : " + avg);
		System.out.println("The product is : " + pro);
		System.out.println("The largest number is : " + l + "\n" + "The smallest number is : " + s);
	}

}
