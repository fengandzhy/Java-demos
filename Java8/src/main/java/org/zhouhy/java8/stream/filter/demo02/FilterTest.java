package org.zhouhy.java8.stream.filter.demo02;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FilterTest {
	
	public static void main(String[] args) {
		List<String> list1 = new ArrayList();
        list1.add("1111");
        list1.add("2222");
        list1.add("3333");

        List<String> list2 = new ArrayList();
        list2.add("3333");
        list2.add("4444");
        list2.add("5555");
        
        // ����
        List<String> interestion = list1.stream().filter(item->list2.contains(item)).collect(Collectors.toList());
        System.out.println("---�õ����� intersection---");
        interestion.stream().forEach(System.out::println);
        
        
        // � (list1 - list2)
        List<String> reduce1 = list1.stream().filter(item->!list2.contains(item)).collect(Collectors.toList());
        System.out.println("---�õ�� (list1 - list2)---");
        reduce1.stream().forEach(System.out::println);
        
        
        List<String> listAll = list1.stream().collect(Collectors.toList());
        List<String> listAll2 = list2.stream().collect(Collectors.toList());
        listAll.addAll(listAll2);
        System.out.println("---�õ����� listAll---");
        listAll.parallelStream().forEach(System.out :: println);
        
        
        List<String> listAllDistinct = listAll.stream().distinct().collect(Collectors.toList());
        System.out.println("---�õ�ȥ�ز��� listAllDistinct---");
        listAllDistinct.parallelStream().forEach(System.out :: println);

        System.out.println("---ԭ����List1---");
        list1.parallelStream().forEach(System.out :: println);
        System.out.println("---ԭ����List2---");
        list2.parallelStream().forEach(System.out :: println);

        
	}
}
