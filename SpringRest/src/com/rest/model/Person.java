package com.rest.model;

public class Person {
	private String name;
	private Double salary;
	private String hobby;
	
	
	public Person(String name, Double salary, String hobby) {
		super();
		this.name = name;
		this.salary = salary;
		this.hobby = hobby;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	public String getHobby() {
		return hobby;
	}
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", salary=" + salary + ", hobby=" + hobby + "]";
	}

}
