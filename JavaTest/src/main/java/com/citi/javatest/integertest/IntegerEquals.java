package com.citi.javatest.integertest;

public class IntegerEquals {

	public static void main(String[] args) {
		Integer a = new Integer(200);
		Integer b = new Integer(200);
		Integer c = 200;
		Integer e = 200;
		int d = 200;
		
		System.out.println("两个new出来的对象    ==判断"+(a==b));
		System.out.println("两个new出来的对象    equal判断"+a.equals(b));
		System.out.println("new出的对象和用int赋值的Integer   ==判断"+(a==c));
		System.out.println("new出的对象和用int赋值的Integer   equal判断"+(a.equals(c)));
		System.out.println("两个用int赋值的Integer    ==判断"+(c==e));
		System.out.println("两个用int赋值的Integer    equal判断"+(c.equals(e)));
		System.out.println("基本类型和new出的对象   ==判断"+(d==a));
		System.out.println("基本类型和new出的对象   equal判断"+(a.equals(d)));
		System.out.println("基本类型和自动装箱的对象   ==判断"+(d==c));
		System.out.println("基本类型和自动装箱的对象   equal判断"+(c.equals(d)));

	}

}
