package com.company.section1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Client {
	public static void main(String[] args) {
		//ѧ������,80��
		int stuNum = 80*10000;
		//List���ϣ���¼����ѧ���ķ���
		List<Integer> scores = new ArrayList<Integer>(stuNum);
		//д�����
		for(int i=0;i<stuNum;i++){
			scores.add(new Random().nextInt(150));
		}

		//��¼��ʼ����ʱ��
		long start = System.currentTimeMillis();
		System.out.println("ƽ�����ǣ�" + average(scores));
		System.out.println("ִ��ʱ�䣺" + (System.currentTimeMillis() -start) + "ms");
	}
	
	//����ƽ����
	public static int average(List<Integer> list){
		int sum = 0;
		//�������
//		for(int i:list){
//			sum +=i;
//		}
		
		for(Iterator<Integer> i=list.iterator(); i.hasNext(); ){
			sum +=i.next();
		}
		//��������������ƽ��ֵ
		return sum/list.size();
	}
}