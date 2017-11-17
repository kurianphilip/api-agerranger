package test;

import java.util.HashMap;

public class Person {
	
	private String firstName;
	private String lastName;
	private String age;
	private String id;
	
	
	HashMap<String, String> setPerson = new HashMap<>();
	
	public  Person(String firstName)
	{
		
		this.firstName = firstName;
		setPerson.put("FirstName", this.firstName);
	}
	
	public  Person (String firstName, String lastName)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		setPerson.put("FirstName", firstName);
		setPerson.put("LastName", lastName);
	}
	
	public  Person(String firstName, String lastName, String age)
	{
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		setPerson.put("FirstName",firstName);
		setPerson.put("LastName",lastName);
		setPerson.put("Age", age);
	}
	
	public Person(String firstName, String lastName, String age, String id)
	{
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.id = id;
		
		
		setPerson.put("FirstName", firstName);
		setPerson.put("LastName", lastName);
		setPerson.put("Age", age);
		setPerson.put("Id", id);
		
		
	}
	
	
	public  HashMap getAttributes()
	{
		return setPerson;
	}

}
