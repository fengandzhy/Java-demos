package org.zhouhy.java8.parallelStream.demo01;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/**
 * parallelStream����˼���ǲ�ֹһ���̶߳�ȡ���list���п���һ�����п�������
 * */
public class parallelStreamTest1 {
	
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		Set<Thread> threadSet = new CopyOnWriteArraySet<>();
		for(int i=0;i<10000;i++) {
			list.add(i);
		}
		//���ﲻһ����һ���߳�
		list.parallelStream().forEach(Integer ->{
			Thread thread = Thread.currentThread();
			threadSet.add(thread);
		});
		System.out.println("threadSetһ����" + threadSet.size() + "���߳�");
        System.out.println("ϵͳһ����"+Runtime.getRuntime().availableProcessors()+"��cpu");		
	}

}
