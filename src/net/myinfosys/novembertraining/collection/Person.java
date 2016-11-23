package net.myinfosys.novembertraining.collection;

import java.util.Objects;

import net.myinfosys.novembertraining.enumeration.Sex;

public class Person implements Comparable<Person> {

	private String name;
	private String birthDay;
	private Sex gender;
	private int age;

	public Person(String name, String birthday, Sex gender, int age) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.birthDay = birthday;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBirthDay() {
		return birthDay;
	}

	public void setBirthDay(String birthDay) {
		this.birthDay = birthDay;
	}

	public Sex getGender() {
		return gender;
	}

	public void setGender(Sex gender) {
		this.gender = gender;
	}
	
	@Override
	public boolean equals(Object o){
		if(o == this){
			return true;
		}if(!(o instanceof Person)){
			return false;
		}
		Person person = (Person) o;
		
		return ((this.name.equals(person.name)) );
	}
	
	@Override
	public int hashCode(){
		return Objects.hashCode(name);
	}
	


	@Override
	public String toString() {
		return "Person [name=" + name + "]";
	}

	@Override
	public int compareTo(Person o) {
		// TODO Auto-generated method stub
		return (name.compareTo(o.getName()));
	}
	
	
	
	

}
