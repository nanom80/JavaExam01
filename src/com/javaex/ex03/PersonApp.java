package com.javaex.ex03;

import java.util.ArrayList;

public class PersonApp {
	
	public static void main(String[] args) {
		
		ArrayList<Person> pList = new ArrayList<>();
		
		Person p1 = new Person();
		p1.setName("유재석");
		p1.setHp("010-1111-1111");
		p1.setCompany("02-1111-1111");
		pList.add(p1);
		
		Person p2 = new Person("이효리", "010-2222-2222", "02-2222-2222");
		pList.add(p2);
		
		Person p3 = new Person("박명수", "010-3333-3333", "02-3333-3333");
		pList.add(p3);
		
		for(Person person : pList) {
			person.showInfo();
		}
		
	}
}