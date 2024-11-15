package com.kh.java.inputsc;

import java.util.Scanner;

public class Exam_Scanner1 {
	public static void main(String[] args) {
		
		/*
		 *  Scanner : Java API, 이미 만들어진 클래스
		 *  키보드를 통해 들어온 입력값을 사용할 수 있도록 해줌
		 *  사용법은 : Scanner 변수명 = new Scanner(System.in);
		 *  변수명 외에는 바뀔 수 없음, 그대로 적어야 함.
		 *  Scanner를 썼을 때 반드시 import(ctrl + space bar_를
		 *  해주어야함
		 */
		
		Scanner sc = new Scanner(System.in);
		// 실제 입력받기 위해서는
		// sc.nextInt()를 적어야함
		// next뒤에 Int를 쓰면 Int를, double를 쓰면 double을
		//아무것도 안쓰면 문자열을 입력받을 수 있음.
		sc.nextInt();
		sc.nextDouble();
		sc.next();
		
		
		
	}
}
