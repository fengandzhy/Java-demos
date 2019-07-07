package com.citi.java8.comparator.demo01;

import java.util.Comparator;
import java.util.List;

public class MultiComparator {

	/**
	 * �ȸ��ݹ��������ٸ������ֵ���
	 * */
	public Comparator<Developer> comparator(List<Developer> list) {
		Comparator<Developer> multiComparator = Comparator.comparing(Developer::getSalary)
				.thenComparing(Developer::getName);		
		return multiComparator;
	}
}
