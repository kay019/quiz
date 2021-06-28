package javaQuiz.beakjoon;

import java.util.Scanner;

public class Q14681 {


    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int n1, n2;

        n1 = sc.nextInt();
        n2 = sc.nextInt();

        if(n1 > 0){
            if(n2 > 0){
                System.out.println("1");
            }else if(n2 < 0){
                System.out.println("4");
            }

        } else if(n1 < 0){
            if(n2 > 0){
                System.out.println("2");
            }else if(n2 < 0){
                System.out.println("3");
            }
        }

		
}
}
