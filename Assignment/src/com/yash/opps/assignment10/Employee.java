package com.yash.opps.assignment10;

import java.text.DateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Employee 
{
	int empid;
	String empname;
	double empsalary;
	String empaddress;
	Date emp_dob;
	LocalDateTime emp_doj;
	public Employee(int empid, String empname, double empsalary, String empaddress, Date emp_dob, LocalDateTime emp_doj) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.empsalary = empsalary;
		this.empaddress = empaddress;
		this.emp_dob = emp_dob;
		this.emp_doj = emp_doj;
	}
	
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empname=" + empname + ", empsalary=" + empsalary + ", empaddress="
				+ empaddress + ", emp_dob=" + emp_dob + ", emp_doj=" + emp_doj + "]";
	}
public static void main(String[] args)
{
	Date d=new Date();
	d.setMonth(1);
	d.setDate(9);
	d.setYear(1999);
	

	LocalDateTime ldt = LocalDateTime.of(1999, 02, 9, 12, 10);
    //specify custom pattern here
String date = DateTimeFormatter.ofPattern("yyyy.MM.dd.").format(ldt);

	Employee e=new Employee(101, "Ajay", 20000, "pune",d,ldt);
	
	
	
	System.out.println(e);
}	
}
