package javaQuiz.beakjoon;

import java.util.Scanner;

public class Q2588 {
	public static void main(String[] args) {
	
	
	Scanner sc = new Scanner(System.in);
	int a,b;
	
	a = sc.nextInt();
	b = sc.nextInt();
	
	if(100 <= a && a <= 999) {
		
		if(100 <= b && b <= 999) {
			
			int c,d,e;
			c = b/100;
			d = b%100/10;
			e = b%100%10;
			
			System.out.println(a*e);
			System.out.println(a*d);
			System.out.println(a*c);
			System.out.println(a*b);
		}
	}
	}
}
