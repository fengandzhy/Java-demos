package org.zhouhy.java8.localdate;

import java.time.LocalDate;

public class LocalDateTest {

	public static void main(String[] args) {
		addDate();
	}
	
	
	
	public static void addDate() {
		System.out.println("�ӷ�����");  
		System.out.println("��ǰ��" + LocalDate.now());  
		System.out.println("��1�죺" + LocalDate.now().plusDays(1));  
		System.out.println("��1�ܣ�" + LocalDate.now().plusWeeks(1));  
		System.out.println("��1�£�" + LocalDate.now().plusMonths(1));  
		System.out.println("��1�꣺" + LocalDate.now().plusYears(1));
		
		System.out.println("��������");  
		System.out.println("��ǰ��" + LocalDate.now());  
		System.out.println("��1�죺" + LocalDate.now().minusDays(1));  
		System.out.println("��1�ܣ�" + LocalDate.now().minusWeeks(1));  
		System.out.println("��1�£�" + LocalDate.now().minusMonths(1));  
		System.out.println("��1�꣺" + LocalDate.now().minusYears(1));
		
		
		System.out.println("��ǰ��" + LocalDate.now());  
		System.out.println("�滻����Ϊ1��" + LocalDate.now().withDayOfMonth(1));  
		System.out.println("�滻����Ϊ1��" + LocalDate.now().withDayOfYear(1));  
		System.out.println("�滻�·�Ϊ1��" + LocalDate.now().withMonth(1));  
		System.out.println("�滻���Ϊ1��" + LocalDate.now().withYear(1));  
	}

}
