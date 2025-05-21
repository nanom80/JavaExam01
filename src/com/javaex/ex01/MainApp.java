package com.javaex.ex01;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

        System.out.println("숫자를 입력하세요");
        System.out.print("숫자: ");
        int num = sc.nextInt();

        if (num > 0) {
            if (num % 2 == 0) {
                System.out.println(num + " 는 짝수입니다.");
            } else {
                System.out.println(num + " 는 홀수입니다.");
            }
        } else if (num == 0) {
            System.out.println("0 는 짝수입니다.");
        } else {
            System.out.println(num + " 는 0보다 작은 수 입니다.");
        }

        sc.close();
    }

}
