package com.citi.corejava.ch03.test;

public class Printf {

	public static void main(String[] args) {
		 /*** ����ַ��� ***/

        // %s��ʾ����ַ�����Ҳ���ǽ�������ַ����滻ģʽ�е�%s
        System.out.printf("%s", new Integer(1212));

        // %n��ʾ����
        System.out.printf("%s%n", "end line");

        // ������֧�ֶ������
        System.out.printf("%s = %s%n", "Name", "Zhangsan");

        // %S���ַ����Դ�д��ʽ���
        System.out.printf("%S = %s%n", "Name", "Zhangsan");

        // ֧�ֶ������ʱ��������%s֮����������ţ�1$��ʾ��һ���ַ�����3$��ʾ��3���ַ���
        System.out.printf("%1$s = %3$s %2$s%n", "Name", "san", "Zhang");

        
	
	}

}
