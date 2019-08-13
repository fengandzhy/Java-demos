package com.citi.java7.chap04.demos;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class FormatNumberToCurrency {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ������");
		double data = sc.nextDouble();
		System.out.println("��������Locale������³�����Ϊ��ʽ������Ĺ������������ò�ͬ�Ļ��Ҹ�ʽ��");
		
		NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.CHINA);
		System.out.println("Locale.CHINA��" + nf.format(data));
		
		nf = NumberFormat.getCurrencyInstance(Locale.US);
		System.out.println("Locale.US��" + nf.format(data));
		
		nf = NumberFormat.getCurrencyInstance(Locale.TAIWAN);
		System.out.println("Locale.TAIWAN��" + nf.format(data));
		
		nf = NumberFormat.getCurrencyInstance(Locale.CANADA);
		System.out.println("Locale.CANADA��" + nf.format(data));
		
	}

}
