package com.citi.corejava.ch03.test;

import java.util.Scanner;

/**
 * ��֤next()��nextLine()������
 * nextֻ�Ƕ�ȡ��������ǰ�����ݣ���nextLine()��ȡ���ǻس���ǰ���е�û�б���ֵ������
 * ���籾��������wew 12 12.3 werwe,��ônextLine()��ȡ�ľ���werwe,��Ϊǰ�����Ѿ�����ֵ��
 * */
public class ScannerTest1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String next = scanner.next();
		System.out.println(next);
		int a = scanner.nextInt();
		System.out.println(a);
		double d = scanner.nextDouble();
		System.out.println(d);
		String str = scanner.nextLine();
		System.out.println(str);
		double e = scanner.nextDouble();
		System.out.println(e);		
		scanner.close();
	}

}
