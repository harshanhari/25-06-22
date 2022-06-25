package home_work;

import java.util.Scanner;

public class Ques9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numbers ");
		int arr[] = new int[10];
		arr[0] = sc.nextInt();
		arr[1] = sc.nextInt();
		arr[2] = sc.nextInt();
		arr[3] = sc.nextInt();
		arr[4] = sc.nextInt();
		arr[5] = sc.nextInt();
		arr[6] = sc.nextInt();
		arr[7] = sc.nextInt();
		arr[8] = sc.nextInt();
		arr[9] = sc.nextInt();
		int temp = 0;
		int count = 0;
		for (int i = 0; i < 10; i++) {
			count++;
			if (arr[i] > temp) {
				temp = arr[i];
			}
		}
		System.out.println("Count of number processed :- " + count);
		System.out.println("The number most recently input is :- " + arr[9]);
		System.out.println("The largest number is :- " + temp);

	}

}
