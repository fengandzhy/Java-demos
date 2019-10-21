package org.zhouhy.java.java8.stream.groupby;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupByDemos {	
	
	public void groupBy1(List<Student> list1) {
		Map<String,List<Student>> map = list1.stream().collect(Collectors.groupingBy(t->t.getName()));
		for(Map.Entry<String,List<Student>> entry:map.entrySet()) {
			System.out.println(entry.getKey()+entry.getValue());
		}
	}
}
