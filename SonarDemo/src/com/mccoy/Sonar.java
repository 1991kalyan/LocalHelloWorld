package com.mccoy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Sonar extends Thread{
	
public void run()
{
	String teststring1="";
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the string");
	String teststring = sc.nextLine();
	
	List<Character> list = new ArrayList<Character>();
	Set<Character> unique = new HashSet<Character>();
	for(char c : teststring.toCharArray()) {
	
	/*char[] stringToCharArray = teststring.toCharArray();

	for (char teststring2 : stringToCharArray)*/
		
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
	
	System.out.println(c);
	}
	
	}
public static void main(String[] args) {
	Sonar a = new Sonar();
	a.start();
}
}
