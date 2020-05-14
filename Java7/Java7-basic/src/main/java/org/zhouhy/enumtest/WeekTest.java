package org.zhouhy.enumtest;

public class WeekTest {

	public static void main(String[] args) {
		Week[] weeks = Week.values();
		for(Week w:weeks){
			System.out.println(w.getNum()+" "+w.getDesc());
		}
		
		//��дtoString֮�󷵻صĽ���Ͳ�һ����
		System.out.println(Week.valueOf(Week.class, "MONDAY"));
		System.out.println(Week.valueOf("MONDAY"));
		
		System.out.println(Week.FRIDAY.toString());
		
		System.out.println(Week.FRIDAY.ordinal());
		
		System.out.println(Week.getWeekByDay().getDesc());
	}

}
