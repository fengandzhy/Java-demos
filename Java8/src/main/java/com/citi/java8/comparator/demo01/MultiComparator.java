package com.citi.java8.comparator.demo01;

import java.util.Comparator;
import java.util.List;

public class MultiComparator {

	
	public Comparator<Developer> comparator(List<Developer> list) {
		Comparator<Developer> multiComparator = Comparator.comparing(Developer::getSalary)
				.thenComparing(Developer::getName);		
		return multiComparator;
	}
	
	/**
	 * �ȸ��ݹ��������ٸ������ֵ���
	 * ��һ��reversed()��ʾ��һ���ֶε���
	 * �ڶ���reversed()��ʾ�ڶ����ֶ�֮ǰ�������ֶ�(Ҳ����˵������һ���ֶ�)����
	 * ����һ������һ���ֶ�,����֮���ٵ��򣬱������,�ڶ����ֶ�����ֻ����һ�ξͳɵ���
	 * ������ʵ�����Ȱ��������������ٸ������ֵ������� 
	 * */
	public Comparator<Developer> comparator1(List<Developer> list) {
		Comparator<Developer> multiComparator = Comparator.comparing(Developer::getSalary).reversed()
				.thenComparing(Developer::getName).reversed();		
		return multiComparator;
	}
}
