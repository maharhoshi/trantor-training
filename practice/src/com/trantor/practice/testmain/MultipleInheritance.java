/**
 * 
 */
package com.trantor.practice.testmain;

import com.trantor.practice.customobjects.Employee;

/**
 * @author hoshiyar.singh
 *
 */
public class MultipleInheritance {
	public static void main(String[] args) {
		Employee employee  =new Employee();
		System.out.println(employee);
		employee.display1(new Employee());
		employee.display1("sdja");
		
	//	employee.display3(2, 2);
	}
}
