package com.csi.comparable;

import java.util.ArrayList;
import java.util.Collections;
class Student implements Comparable<Student> {
	int rollno;
	String name;
	int age;
Student(int rollno, String name, int age) {
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}

	@Override
public String toString() {
	return "Student [rollno=" + rollno + ", name=" + name + ", age=" + age + ", getClass()=" + getClass()
			+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
}

	public int compareTo(Student st) {
		if (age == st.age)
			return 0;
		else if (age > st.age)
			return 1;
		else
			return -1;
	}
}

// Creating a test class to sort the elements
public class TestSort3 {
	public static void main(String args[]) {
		ArrayList<Student> al = new ArrayList<Student>();
		al.add(new Student(101, "Vijay", 23));
		al.add(new Student(106, "Ajay", 27));
		al.add(new Student(105, "Jai", 21));
		al.add(new Student(123, "raj", 231));

		Collections.sort(al);
		System.out.println(al);
		for (Student st : al) {
System.out.println(st.rollno + " " + st.name + " " + st.age);
System.out.println(st.rollno+" "+st.age+" "+st.name);

}}}
