package org.zhouhy.javatest.integertest;

public class IntegerEquals {

	public static void main(String[] args) {
		Integer a = new Integer(200);
		Integer b = new Integer(200);
		Integer c = 200;
		Integer e = 200;
		int d = 200;
		
		System.out.println("����new�����Ķ���    ==�ж�"+(a==b));
		System.out.println("����new�����Ķ���    equal�ж�"+a.equals(b));
		System.out.println("new���Ķ������int��ֵ��Integer   ==�ж�"+(a==c));
		System.out.println("new���Ķ������int��ֵ��Integer   equal�ж�"+(a.equals(c)));
		System.out.println("������int��ֵ��Integer    ==�ж�"+(c==e));
		System.out.println("������int��ֵ��Integer    equal�ж�"+(c.equals(e)));
		System.out.println("�������ͺ�new���Ķ���   ==�ж�"+(d==a));
		System.out.println("�������ͺ�new���Ķ���   equal�ж�"+(a.equals(d)));
		System.out.println("�������ͺ��Զ�װ��Ķ���   ==�ж�"+(d==c));
		System.out.println("�������ͺ��Զ�װ��Ķ���   equal�ж�"+(c.equals(d)));

	}

}
