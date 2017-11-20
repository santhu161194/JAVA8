package com.selflearn.java8;

public class Employee {
int id;
String name;

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Employee(int id, String name) {
	super();
	this.id = id;
	this.name = name;
}
public Employee() {
	super();
}
@Override
public boolean equals(Object obj) {
	if(this!=null&&obj!=null)
	{
		if(this==obj)
			return true;
		else if(!(obj instanceof Employee))
			return false;
		Employee emp=(Employee) obj;
		return ((this.id==emp.id)&&(this.name.equals(emp.name)));
	}
	
	return false;
	
}

@Override
public int hashCode()
{
return this.id;	
}
}
