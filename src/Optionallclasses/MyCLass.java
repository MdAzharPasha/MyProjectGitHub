package Optionallclasses;

import java.util.Date;
import java.util.Optional;
import java.util.Scanner;

public class MyCLass {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number");
	int userId =sc.nextInt();
	 User us = new User();
//	String userName= us.getCityNameById(userid);
//	String st = userName.toLowerCase()+"Hello";
//	System.out.println(st);
	 Optional<String> userName = us.getCityNameById(userId);
	 if(userName.isPresent()) {
		String userName1 = userName.get();
		System.out.println(userName1.toUpperCase());
	
	 }else {
		 System.out.println("Invalid Username");
	 }
	
}
}
