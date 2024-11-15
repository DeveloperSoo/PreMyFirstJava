package com.kh.java.exercise;

import java.util.Scanner;

public class Exercise_Basic2 {
	public static void main(String[] args) {
		/*
		 * 입력받은 문자가 대문자인지 소문자인지 확인하는 프로그램을 작성하여라.
		 * 문자하나 입력 : a
		 * 영어 대문자 확인 : false
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("문자 하나 입력 : ");
		char one = sc.next().charAt(0);
		boolean result = (one >= 'A') && (one <= 'Z'); // 문자 또한 숫자로 기억되기에 가능한 조건
		System.out.println("영어 대문자 확인 : " + result);			
	}
}
