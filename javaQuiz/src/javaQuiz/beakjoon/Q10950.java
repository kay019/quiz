package javaQuiz.beakjoon;

import java.util.Scanner;


public class Q10950 {

	public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int n, a, b, sum;


        n = sc.nextInt();


        for(int i = 1; i <= n; i++){

            a = sc.nextInt();
            b = sc.nextInt();
            sum = a + b;
            System.out.println(sum);
        }

	}

}
