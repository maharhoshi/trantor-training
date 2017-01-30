/**
 * 
 */
package com.trantor.practice.strings;

/**
 * @author hoshiyar.singh
 *
 */
public class StringTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = new String("Java");
		String str2 = new String("Java");
		String str3 = str;
		String str4 = "Java";
		String str5 = "JavA";
		
		str = str.concat("Programming");

		System.out.println(str);
		System.out.println(str3);
		System.out.println(str2);
		
		System.out.println(str == str2);
		System.out.println(str == str3);
		System.out.println(str3 == str4);
		System.out.println(str4 == str5);
	}

}
