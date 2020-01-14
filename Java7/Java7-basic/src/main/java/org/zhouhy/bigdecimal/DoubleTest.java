package org.zhouhy.bigdecimal;

/**
 * ���ﲻ�ܼ�@Test��Ϊ���ǲ��Եĵط�
 * ���¿��Կ�����double�����ǲ�׼ȷ��
 * */
public class DoubleTest {
	
	public static void main(String args[]){
		
		System.out.println(0.01+0.05);
		System.out.println(1.0-0.42);
		System.out.println(4.015*100);
		System.out.println(123.3/100);
		System.out.println(Math.round(4.015*100)/100.0);
		
		System.out.println("===================");
		
		System.out.println(ArithUtil.add(0.01, 0.05));
		System.out.println(ArithUtil.sub(1.0, 0.42));
		System.out.println(ArithUtil.mul(4.015, 100));
		System.out.println(ArithUtil.div(123.3, 100));
		System.out.println(ArithUtil.round(4.015, 2));
		
	}
}
