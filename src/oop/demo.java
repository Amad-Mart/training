package oop;

class Person{
	
	String name;
	String email;
	String phone;
	
	void walk(){
		System.out.println(name + " is wlaking");
	}
	
	void eat() {
		System.out.println(email);
	}
	
	void sleep() {
		System.out.println(name + " is sleeping");
	}
}

public class demo {

	public static void main(String[] args) {
		//Instantiating an obj
		Person person1 = new Person();
		
		//Define some props
		person1.name = "Joe";
		person1.email = "jepp@goop.com";
		person1.phone = "234234523";
		
		//Abstraction
		person1.walk();
		person1.sleep();
		person1.eat();
		
		
		/*
		//Person
		walking(name);
		String name = "joe";
		String email = "tester@gop.com";
		String phone = "1234567890";
		
		//Action, activity, behavior
		walking(name);
		System.out.println(name + " is walking");
		
		//what about binding attributes and properties together?
		
	}
	
	// enhance by adding f(x)s to minimize code
	static void walking(String name) {
		System.out.println(name + " is walking");*/
	}

}
