package CSVDataHandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

class Student{
	String name;
	String department;
	double salary;
	ArrayList<Student> students=new ArrayList<>();
	Student(String name,String department,double salary){
		this.name=name;
		this.department=department;
		this.salary=salary;
	}
	public void add(Student s) {
		students.add(s);
		System.out.println("ADDED IN LIST:");
	}
	public void display() {
		System.out.println(students);
	}
	
}
public class CSVDataJavaObjects {

	public static void main(String[] args) {
		try {
			BufferedReader bfr=new BufferedReader(new FileReader("S:\\Eclipse\\BridgeLabzTraining\\src\\CSVDataHandling\\Data.csv"));
			bfr.readLine();
			String line;
			while((line=bfr.readLine())!=null) {
				String[] columns=line.split(",");
				
				Student s=new Student(columns[0],columns[1],Double.parseDouble(columns[2]));
				s.add(s);
				s.display();
				
				
				
			} 
			
			
			
		}catch(IOException e) {
			e.getStackTrace();
		}
		// TODO Auto-generated method stub

	}

}
