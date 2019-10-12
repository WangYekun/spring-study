package com.company.section;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.apache.commons.lang.builder.CompareToBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

public class Client {
	public static void main(String[] args) {
		List<Employee> list = new ArrayList<Employee>(5);
		//һ���ϰ�
		list.add(new Employee(1001,"����",Position.Boss));
		//��������
		list.add(new Employee(1006,"����",Position.Manager));
		list.add(new Employee(1003,"����",Position.Manager));
		//����ְԱ
		list.add(new Employee(1002,"����",Position.Staff));
		list.add(new Employee(1005,"����",Position.Staff));
		//����id����Ҳ���ǰ���������ǳ����
		Collections.sort(list);
		for(Employee e:list){
			System.out.println(e);
		}
		
		System.out.println("----");
		Collections.sort(list, new PositionComparator());
		for(Employee e:list){
			System.out.println(e);
		}
		
		System.out.println("************");
		Collections.reverse(list);
		for(Employee e:list){
			System.out.println(e);
		}
		
		
		System.out.println("----");
		Collections.sort(list, Collections.reverseOrder(new PositionComparator()));
		for(Employee e:list){
			System.out.println(e);
		}
		
		
	}
}

enum Position {
	Boss, Manager, Staff
}

class Employee implements Comparable<Employee> {
	//id�Ǹ��ݽ��빫˾���Ⱥ�˳������
	private int id;
	//����
	private String name;
	//ְλ
	private Position position;

	public Employee(int _id, String _name, Position _position) {
		id = _id;
		name = _name;
		position = _position;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Position getPosition() {
		return position;
	}

	public void setPosition(Position position) {
		this.position = position;
	}
	//����id������Ҳ������������ǳ����
	@Override
	public int compareTo(Employee o) {
		return new CompareToBuilder().append(id, o.id).toComparison();
	}
	
	
	@Override
	public String toString(){
		 return ToStringBuilder.reflectionToString(this);
	}
}
//ְλ������
class PositionComparator implements Comparator<Employee>{
	@Override
	public int compare(Employee o1, Employee o2) {
		//����ְλ��������
		return o1.getPosition().compareTo(o2.getPosition());
	}
	
}