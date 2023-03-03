package collection_3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student implements Comparable<Student> ,Comparator<Student>{

	int id;

	String name;

	public Student(int id, String name) {
		this.id = id;
		this.name = name;

	}

	public Student() {
		// TODO Auto-generated constructor stub
	}

	public int getId() {

		return id;
	}

	public String getName() {
		return name;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}

	@Override
	public int compareTo(Student s1) {
		return this.name.compareTo(s1.name);
			}

	@Override
	public int compare(Student o1, Student o2) {
		if (o1.id > o2.id )
		{
			return 1;
		}
			

		else if (o1.id < o2.id )
			{
			return -1;
			}
		return 0;
		
		
	}

}

public class Comparable_2 {

	public static void main(String[] args) {
	
		List<Student> l=new ArrayList<Student>();
		
		l.add(new Student(100, "shashi"));
		l.add(new Student(101,"rad"));
		l.add(new Student(105, "ma"));
		l.add(new Student(109,"chitrkant"));
		l.add(new Student(104, "vinay"));
		l.add(new Student(103,"ajay"));

		
		
		
		
		  Collections.sort(l);
		//// printing the sorted list of names
		 for(Student s:l)
		 {
			 System.out.println(s.getName() + "  ");
		 }
	
		// Sorts the array list using comparator
		 
		 
		
		 Collections.sort(l,new Student());
		 
		System.out.println(" ");
		
		for(Student s1:l)
		{
			System.out.print( s1.getName()+ " " +    s1.getId()+ "  ");
		}
		
	}	

}
