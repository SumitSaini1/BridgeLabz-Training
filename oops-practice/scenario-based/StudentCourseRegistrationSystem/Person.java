package oops.StudentCourseRegistrationSystem;
import java.util.List;

import java.util.ArrayList;

public class Person {
    protected int personId;
    protected String personName;
    protected int age;
    protected String address;
    public Person(int personId,String personName,int age,String address){
        this.personId=personId;
        this.personName=personName;
        this.age=age;
        this.address=address;

    }
    public void display() {
        System.out.println("Person ID   : " + personId);
        System.out.println("Name        : " + personName);
        System.out.println("Age         : " + age);
        System.out.println("Address     : " + address);
    }
    
}

