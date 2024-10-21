package com.campusdual.classroom;

public class Person {
	protected String name;
	protected String surname;


	public Person(String name, String surname) {
		this.name = name;
		this.surname = surname;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public void getDetails(){
		System.out.println("Name: " + this.name + " Surname: " + this.surname);
	}
}
