/**
 * 
 */
package com.trantor.practice.customobjects;

/**
 * @author hoshiyar.singh
 *
 */
public class Employee extends Person {
	private String firstName;
	private String lastName;
	
	public Employee(String name) {
		// TODO Auto-generated constructor stub
		super(name);
	}
	public Employee() {
		// TODO Auto-generated constructor stub
		this(null);
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public static void display1(String name) {
		System.out.println("Hey there !!!!!!!!! "+name);
	}
	public void display1(Object obj) {
		System.out.println("Hey there !!!!!!!!!!! "+firstName);
	}
	public void display3(int i, double d) {
		System.out.println("Hey there !!!!!!!!!!! int and double ");
	}
//	public void display3(int i, int d) {
//		System.out.println("Hey there !!!!!!!!!!! int and int ");
//	}
//	public void display3(double i, double d) {
//		System.out.println("Hey there !!!!!!!!!!! double and double ");
//	}
	public void display3(double i, int d) {
		System.out.println("Hey there !!!!!!!!!!! double and int ");
	}
}
