package com.yash.opps.assignment9;

public class Empolyee implements Cloneable
{
int eid;
String name;
double salary;
String department;

public Empolyee(int eid, String name, double salary, String department) {
	super();
	this.eid = eid;
	this.name = name;
	this.salary = salary;
	this.department = department;
}

public static void main(String[] args) throws CloneNotSupportedException 
{
	Empolyee e1=new Empolyee(101, "Amit", 10000, "IT");
	
	
System.out.println("USING Base Object ");
System.out.println("EID ="+e1.eid);
System.out.println("EName ="+e1.name);
System.out.println("Esalary ="+e1.eid);
System.out.println("Emp dept ="+ e1.department);

Empolyee e2=(Empolyee) e1.clone();

System.out.println("After clone Object ");
System.out.println("EID ="+e2.eid);
System.out.println("EName ="+e2.name);
System.out.println("Esalary ="+e2.eid);
System.out.println("Emp dept ="+ e2.department);

System.out.println("e1 hashcode ="+e1.hashCode());
System.out.println("e2 hashcode ="+e2.hashCode());





System.out.println(e1==e2);
	
	
}
}
