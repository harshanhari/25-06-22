package home_work;

import java.util.Scanner;

public class Ques8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		if (a % b == 0) {
			System.out.println(a + " is a multiple of " + b);
		} else {
			System.out.println(a + " is not a multiple of " + b);

		}
	}

}
