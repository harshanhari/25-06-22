package home_work;

import java.util.Scanner;

public class Ques3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value : ");
		double f = sc.nextDouble();
		double c = ((f - 32) * 5) / 9;
		System.out.println(f + "°F is " + c + "°C");
	}

}
