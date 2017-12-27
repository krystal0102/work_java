package com.koitt.class01.java.ch03;

public class TypeCast {
	
	public static void main(String[] args) {
		
		// 1. 명시적 형변환
		byte b = (byte)128; //int형인 128을 byte로 명시적 형변환
		System.out.println(b);
		
		byte bt = (byte) -129;
		System.out.format("%d의 이진수 : %s %n", -129, Integer.toBinaryString(-129));
		System.out.format("%d의 이진수 : %s %n",bt, Integer.toBinaryString(bt));
		
		int n = (int) ( 5.0 / 4.0);
		System.out.println(n); // 값 1.25의 명시적 형변환 double -> int
		System.out.println(3 / 4); // int형으로 나오기 때문에 형변환없이 0으로 출력
		System.out.println(3 / 4.0); // 묵시적 변환 int -> double (int3을 double4.0 을 만나면서 컴파일러가 
									//double3.0으로 바꿔 3.0나누기 4.0이 됨)
		
		double d = 3 + 4*2;
		System.out.println(d); // 묵시적 형변환 int -> double 
	}

}
