package collectors;

import java.util.*;
import java.util.stream.Collectors;
class Student{
	private String name;
	private char grade;
	
	public Student(String name, char grade) {
		this.name = name;
		this.grade = grade;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public char getGrade() {
		return grade;
	}
	public String toString() {
		return name;
	}
	
}
public class StudentResultGrouping {

	public static void main(String[] args) {
		ArrayList<Student> students=new ArrayList<>();
		students.add(new Student("Sumit",'A'));
		students.add(new Student("Rahul",'B'));
		students.add(new Student("Aditya",'A'));
		students.add(new Student("Dev",'C'));
		students.add(new Student("Abhuinav",'B'));
		Map<Character,List<Student>> group=students.stream().collect(Collectors.groupingBy(Student::getGrade));
		
		System.out.println(group);
		
		


	}

}
