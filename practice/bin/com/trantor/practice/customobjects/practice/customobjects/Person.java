/**
 * 
 */
package com.trantor.practice.customobjects;

/**
 * @author hoshiyar.singh
 *
 */
public class Person {
	private String name;
	public Person(String name) {
		// TODO Auto-generated constructor stub
		this.name = name;
	}
//	public Person() {
//		// TODO Auto-generated constructor stub
//	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String toString() {
		return "Person:::::"+name;
	}
	
}
