package com.codegnan.oopexamples;

public class Person {
    //instance variables(field)
	private String name;
	private int age;
	private double height;
	
	//mutator methods
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setAge(int age) {
		if(age>=0) {
			this.age=age;
		}else {
			System.out.println("Age cannot be negative");
		}
	}
	public int getAge() {
		return age;
	}
	public void setHeight(double height) {
		if(height>0) {
			this.height=height;
		}else {
			System.out.println("Height must be positive");
		}
	}
	public double getHeight() {
		return height;
	}
	
	//operational methods
	public void introduce() {
		System.out.println("Hello, My name is: "+name+" I am "+age+" years old and "+height+" meters tall");
	}
	public boolean isAdult() {
		return age>=18;
	}
	public void celebrateBirthday() {
		age++;
		System.out.println("Happy Birthday!"+name+" is now "+age+" years old");
	}
	//static method - belongs to class not to instances.
	public static String getSpeciesName() {
		return "Homo spanies";
	}
	//final method: cannot be overriden by subclass.
	public final String getIdentification() {
		return name+" ,"+age+" Years old";
	}
	
}
