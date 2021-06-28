package javaQuiz.beakjoon;


import java.util.Scanner;


public class Q2884 {


    public static void main(String args[]) {

    	 Scanner sc = new Scanner(System.in);
         int h, m;

         h = sc.nextInt();
         m = sc.nextInt();


         if(m >= 45){
             m = m - 45;
         } else if( m < 45){
             m = 60 + (m - 45);

                 h = h - 1;
                 if(h < 0){
                     h = h + 24;
                 }

         }


         System.out.println( h + " " + m);
    }

}
