package practice;

import java.sql.Date;

// 1. Make class as fianl class
public final class ImmutableClass {

	// 2. provide all field are private and final;
	private final String name;
    private final int age;
    private final Date birthDate;
    
    public ImmutableClass(String name , int age, Date birthDate) {
    	this.name = name;
    	this.age = age;
    	this.birthDate = birthDate;
    	
    }
   
//    3.provide only getter method Don't provide settetr method
    public String getName() {
    	return name;
    }
    
    public int getAge() {
    	return age;
    }
    
    public Date getBithDate() {
    	return birthDate;
    }
}
