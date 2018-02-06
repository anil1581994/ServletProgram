package pack1;

import java.util.Scanner;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularEx {
public static void main(String[] args) {
	/* 
	 *  ^                         Start anchor
	 *  (?=.*[A-Z].*[A-Z])        Ensure string has two uppercase letters.
	 *  (?=.*[!@#$&*])            Ensure string has one special case letter.
	 *  (?=.*[0-9].*[0-9])        Ensure string has two digits.
	 *  (?=.*[a-z].*[a-z].*[a-z]) Ensure string has three lowercase letters.
	 *  .{8}                      Ensure string is of length 8.
	 *  $                         End anchor.
	 */
	Scanner sc=new Scanner(System.in);
	System.out.println("enter name");
	String name=sc.nextLine();
	System.out.println("enter password");
	String password=sc.nextLine();
	System.out.println("enter Email");
	String email=sc.nextLine();
	System.out.println("enter the phone number");
	String phoneNumber=sc.next();
	
	
    String  regxPhoneNumber="[0-9]{10}";
    
	String regxName="[a-zA-Z]{2,30}";
	
	String regxPassword= "^(?=.*[A-Z].*[A-Z])(?=.*[!@#$&*])(?=.*[0-9].*[0-9])(?=.*[a-z].*[a-z].*[a-z]).{8}$";
	
	//String regxEmail="^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
	      //  + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
	String regxEmail="^([a-zA-Z0-9_.-])+@(([a-zA-Z0-9-])+.)+([a-zA-Z])+$";  
	       

	
	//String regxEmail="^[a-zA-z0-9]{4,}(?=.*[@])([a-z]s{6})([.]{1})([a-z]{2,3})$";
	Pattern p = Pattern.compile(regxName);
	Matcher m = p.matcher(name);  
	boolean a = m.matches();  

	Pattern p1 = Pattern.compile(regxPassword);
	Matcher m1 = p1.matcher(password);  
	boolean b = m1.matches();  

	Pattern p2 = Pattern.compile(regxEmail);
	Matcher m2 = p2.matcher(email);  
	boolean c = m2.matches();  

	Pattern p3 = Pattern.compile(regxPhoneNumber);
	Matcher m3 = p3.matcher(phoneNumber);  
	boolean d = m3.matches();  

	System.out.println(a);
	System.out.println(b);
	System.out.println(c);
	System.out.println(d);
	
}
}
