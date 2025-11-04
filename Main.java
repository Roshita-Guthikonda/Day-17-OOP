package com.codegnan.oopexamples;

public class Main {

	public static void main(String[] args) {
		Person p=new Person();
		p.setName("Roshita");
		p.setAge(21);
		p.setHeight(5.2);
		p.getName();
		p.getAge();
		p.getHeight();
		//operational methods
		p.introduce();
		p.celebrateBirthday();
		System.out.println(p.isAdult());
		p.introduce();
		System.out.println(Person.getSpeciesName());
	
		System.out.println(p.getIdentification());
	}

}
