/**
 * 
 */
package com.trantor.practice.strings;

/**
 * @author hoshiyar.singh
 *
 */
public class Student {

	String name;
	int id;
	public Student(String name, int id) {
		// TODO Auto-generated constructor stub
		this.name=name;
		this.id=id;
	}



	/*@Override
	public boolean equals(Object obj) 
	{
		// TODO Auto-generated method stub

		try
		{
			String name1 = this.name;
			int id1 = this.id;

			Student s1 = (Student)obj;
			String name2 = s1.name;
			int id2 = s1.id;

			if(name1.equals(name2) && (id1==id2))
			{
				return true;
			}
			else
			{
				return false;
			}}
		catch (ClassCastException e) {
			// TODO: handle exception
			return false;		
		}
		catch (NullPointerException e) {
			// TODO: handle exception
			return false;
		}
	}	*/

	
	
	/*public boolean equals(Object obj) 
	{
		// TODO Auto-generated method stub


		if(obj instanceof Student)
		{
			String name1 = this.name;
			int id1 = this.id;

			Student s1 = (Student)obj;
			String name2 = s1.name;
			int id2 = s1.id;

			if(name1.equals(name2) && (id1==id2))
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		else
		{
			return false;
		}
	}*/

	
	public boolean equals(Object obj) 
	{
		// TODO Auto-generated method stub

		if(obj==this)
		{
			return true;
		}
		else
		{
			String name1 = this.name;
			int id1 = this.id;

			Student s1 = (Student)obj;
			String name2 = s1.name;
			int id2 = s1.id;

			if(name1.equals(name2) && (id1==id2))
			{
				return true;
			}
			else
			{
				return false;
			}
		}
	}

	public static void main(String[] args) {
		Student obj1 = new Student("ravi", 101);
		Student obj2 = new Student("ravi", 101);
		Student obj3 = obj1;



		System.out.println("" +obj1.equals(obj2));
		System.out.println("" +obj1.equals(obj3));
		System.out.println("" +obj3.equals("Welcome")) ;
		System.out.println("" +obj3.equals(null));

	}
}
