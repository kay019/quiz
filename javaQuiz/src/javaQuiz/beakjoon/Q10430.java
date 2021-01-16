package javaQuiz.beakjoon;

import java.util.Scanner;

public class Q10430 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a, b, c;

		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();

		if (2 <= a && a <= 10000) {

			if (2 <= b && b <= 10000) {

				if (2 <= c && c <= 10000) {

					System.out.println((a + b) % c);
					System.out.println(((a % c) + (b % c)) % c);
					System.out.println((a * b) % c);
					System.out.println(((a % c) * (b % c)) % c);
				}
			}
		}
	}

}
