package com.jana.app;

import java.util.*;
public class Test1 {

	public static void noofpersons(Test[]a,String area1) {
		int count=0;
		
		for(int i=0;i<a.length;i++) {
			
			if(a[i].getArea().equals(area1)) {
				count++;
			}
		}
			System.out.println("no.of persons living in "+area1+"is "+count);
		
	}
	public static void findperson(Test []a,String area2,Long phone1) {
		String p="";
for(int i=0;i<a.length;i++) {
			
			if((a[i].getArea().equals(area2))&&(a[i].getPhone().equals(phone1))) {
				p=a[i].getPerson();
				
			}
		}
System.out.println("person name having mobileNumber "+phone1+"in "+area2+"is "+p);
	}
	public static void main(String[] args) {
		Test a1=new Test("Indiranagar","sankar",9908408108L);
		Test a2=new Test("Indiranagar","jaya",6302969426L);
		Test a3=new Test("koramangala","jana",9513827132L);
		Test a4=new Test("koramangala","appadi",9346839033L);
		Test a5=new Test("koramangala","prathap",9490494795L);
		Test []a = {a1,a2,a3,a4,a5};
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string");
		String area1=sc.nextLine();
		
		
//		String person=sc.nextLine();
//		Test1 t=new Test1();
//		Long phone=sc.nextLong();
		noofpersons(a, area1);
		System.out.println("enter area");
		String area2=sc.nextLine();
		System.out.println("enter phonenumber");
		Long phone1=sc.nextLong();
		findperson(a,area2,phone1);

	}

}
