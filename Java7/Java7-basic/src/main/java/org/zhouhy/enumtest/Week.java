package org.zhouhy.enumtest;


/**
1��ʹ��enum�����ö����Ĭ�ϼ̳���java.lang.Enum��ʵ����java.lang.Comparable�ӿڣ��Ҳ��ܼ̳������࣬Ҳ�����Ա��̳С�
��ö�������ʵ��һ�������ӿڡ�������ѧϰ������Enum��Դ�롣
2��ö���������ʵ��������ڵ�һ����ʾ������ʹ��new��������ʾ���ù��췽����ÿ����������public static final���εģ������ԷֺŽ�����
��֮��ķ������У����ǾͿ������ö������ʵҲ�ǿ��﷨�ǡ�
3��ö����Ĺ��췽����˽�еģ�Ĭ�ϵľ���private�������ʱ�򲻼�Ҳû�¡�
4��switch()��������ʹ��enum������ں�������ϸ���롣
5���ǳ���ö����Ĭ����final�ĵ������ʱ�����finalȴ���벻ͨ��������ͨ�������ķ�������Եõ���֤��
6��ö��������г��󷽷������Ǳ���������ʵ����ʵ�֡�����Ҳ����֤��һ����
 * */
public enum Week {
	MONDAY(0,"����һ"),
	TUESDAY(1,"���ڶ�"),
	WEDNESDAY(2,"������"),
    THURSDAY(3,"������"),
    FRIDAY(4,"������"),
    SATURDAY(5,"������"),   
    SUNDAY(6,"������"); //���һ�����ͱ���Ҫ�÷ֺŽ���
	
	private int num;
	private String desc;
	
	Week(int num,String desc){
		this.num = num;
		this.desc = desc;
	}
	
	public String getDesc(){
		return this.desc;
	}
	
	public int getNum(){
		return this.num;
	}
	
	public static Week getWeekByDay(){
		return Week.FRIDAY;
	}
	
	@Override
	public String toString() {
		switch (this) {
	        case MONDAY:
	            return "��������һ";
	        case TUESDAY:
	            return "�������ڶ�";
	        case WEDNESDAY:
	            return "����������";
	        case THURSDAY:
	            return "����������";
	        case FRIDAY:
	            return "����������";
	        case SATURDAY:
	            return "����������";
	        case SUNDAY:
	            return "����������";
	        default:
	            return "Unknow Day";
	    }
	}
}
