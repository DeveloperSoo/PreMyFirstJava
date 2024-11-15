package com.kh.java.basic;

public class Exam_DataType {
	public static void main(String [] args) {
		// int, String, ....
		// byte, short, int, long => 정수 패밀리
		byte bNum = 127;
		short sNum = 32767;
		int iNum = 2147483647;
		long lNum = 2147483648l;
		// float, double => 실수 패밀리
		float fNum = 24.1118f;
		double dNum = 25.518;
		// char => 문자(한글자)
		char alphabet = 'A';
		// boolean => 참거짓
		boolean yesOrNo = true; // false
		// String => 문자(여러글자)
		String message = "Hello World";
		
		// bNum의 값 : 127
		System.out.println("bNum의 값 : "+bNum);
		// sNum의 값 : 32767
		System.out.println("sNum의 값 : "+sNum);
		// iNum의 값 : 2147483647
		System.out.println("iNum의 값 : "+iNum);
		// lNum의 값 : 2147483648
		System.out.println("lNum의 값 : "+lNum);
		// fNum의 값 : 24.1118
		System.out.println("fNum의 값 : "+fNum);
		// dNum의 값 : 25.518
		System.out.println("dNum의 값 : "+dNum);
		// alphabet : A
		System.out.println("alphabet : "+alphabet);
		// yesOrNo : true
		System.out.println("yesOrNo : "+yesOrNo);
		// message : Hello World
		System.out.println("message : "+message);
	}
}






