package com.koitt.class01.java.ch03;

public class TypeCast {
	
	public static void main(String[] args) {
		
		// 1. ����� ����ȯ
		byte b = (byte)128; //int���� 128�� byte�� ����� ����ȯ
		System.out.println(b);
		
		byte bt = (byte) -129;
		System.out.format("%d�� ������ : %s %n", -129, Integer.toBinaryString(-129));
		System.out.format("%d�� ������ : %s %n",bt, Integer.toBinaryString(bt));
		
		int n = (int) ( 5.0 / 4.0);
		System.out.println(n); // �� 1.25�� ����� ����ȯ double -> int
		System.out.println(3 / 4); // int������ ������ ������ ����ȯ���� 0���� ���
		System.out.println(3 / 4.0); // ������ ��ȯ int -> double (int3�� double4.0 �� �����鼭 �����Ϸ��� 
									//double3.0���� �ٲ� 3.0������ 4.0�� ��)
		
		double d = 3 + 4*2;
		System.out.println(d); // ������ ����ȯ int -> double 
	}

}
