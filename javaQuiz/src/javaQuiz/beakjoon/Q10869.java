package javaQuiz.beakjoon;

import java.util.Scanner;

public class Q10869 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a, b;

		a = sc.nextInt();
		b = sc.nextInt();
		if (1 <= a) {
			if (b <= 10000) {
				System.out.println(a + b);
				System.out.println(a - b);
				System.out.println(a * b);
				System.out.println(a / b);
				System.out.println(a % b);
			}
		}

	}

}
