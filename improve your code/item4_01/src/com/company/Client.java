package com.company;

public class Client {
	public static void main(String[] args) {
		String str1= "�й�";
		String str2 = "�й�";
		String str3 = new String("�й�");
		String str4 = str3.intern();
		
		String str5 = str3 + " ";
		boolean b1 = (str1==str2);
		boolean b2 = (str1 == str3);
		boolean b3 = (str1 == str4);
		
		System.out.println(str1.hashCode());
		System.out.println(str5.trim().hashCode());
	}
}