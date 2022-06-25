package home_work;

import java.util.Scanner;

public class Ques6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers :- ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		if (a > b) {
			System.out.print(a + " is larger");
		} else if (a < b) {
			System.out.print(b + " is larger");
		} else {
			System.out.print("These numbers are equal");
		}
	}

}
