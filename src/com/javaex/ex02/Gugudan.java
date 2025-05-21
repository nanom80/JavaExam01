package com.javaex.ex02;

import java.util.Scanner;

public class Gugudan {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

        System.out.println("숫자를 입력하세요");
        System.out.print("단: ");
        int dan = sc.nextInt();

        if (dan >= 2 && dan <= 9) {
            for (int i = 1; i <= 9; i++) {
                System.out.println(dan + " * " + i + " = " + (dan * i));
            }
        } else {
            System.out.println("2단에서 9단까지만 출력 가능합니다.");
        }

        sc.close();
		
	}
}
