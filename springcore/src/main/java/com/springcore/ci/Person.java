package com.springcore.ci;

public class Person {
	private String personName;
	private int personId;
	
	public Person(String personName, int personId) {
		this.personName = personName;
		this.personId = personId;
	}

	@Override
	public String toString() {
		return "Person [personName=" + personName + ", personId=" + personId + "]";
	}
}
