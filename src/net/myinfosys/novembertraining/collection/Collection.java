package net.myinfosys.novembertraining.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

import net.myinfosys.novembertraining.enumeration.Sex;

public class Collection {

	public static void main(String[] args) {
		Person person1 = new Person("a", "11/12/1993", Sex.MALE, 21);
		Person person2 = new Person("b", "11/12/1993", Sex.FEMALE, 22);
		Person person3 = new Person("c", "11/12/1993", Sex.FEMALE, 23);
		Person person4 = new Person("d", "11/12/1993", Sex.MALE, 24);
		Person person5 = new Person("e", "11/12/1993", Sex.MALE, 25);

		List<Person> people = new ArrayList<Person>();
		people.add(person1);
		people.add(person2);
		people.add(person3);
		people.add(person4);
		people.add(person5);
		
		//using forEACH
		for (Person list : people) {
			if(list.getGender().equals(Sex.FEMALE)){
				System.out.println("name :" + list.getName());
			}
		}
		//remove object
		people.remove(person3);
		
		//using lambda expression
		String o= people.stream().map(Person::getName).collect(Collectors.joining("|"));
		System.out.println(o);
		
		//using iterator
		Iterator<Person> it= people.iterator();
		while(it.hasNext()){
			//it.remove();
			String org = it.next().getName();
			System.out.println("person now :"+org);
			}
		
		//https://www.hackerrank.com/tests/4l9bm42bpnm/redirect
		System.out.println("person now :"+people.containsAll(people));
		System.out.println("person now :"+people.addAll(people));
		System.out.println("person now :"+people.removeAll(people));
		
		
	}
}
