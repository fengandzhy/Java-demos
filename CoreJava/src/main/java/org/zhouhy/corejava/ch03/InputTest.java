package org.zhouhy.corejava.ch03;

import java.util.Scanner;

public class InputTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("What's your name?");
		String name = scanner.nextLine();
		
		System.out.println("How old are you?");
		int age = scanner.nextInt();
		
		//ע������Ҫ�Ӹ����ţ�����ͱ���ַ��������
		System.out.println("Hello "+name+" next year you will be "+(age+1));
		
		scanner.close();
	}

}
