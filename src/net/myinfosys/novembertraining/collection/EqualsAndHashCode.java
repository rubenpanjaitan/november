package net.myinfosys.novembertraining.collection;




import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;

import net.myinfosys.novembertraining.enumeration.Sex;

public class EqualsAndHashCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person person1 = new Person("a", "11/12/1991", Sex.MALE, 22);
		Person person2 = new Person("b", "11/12/1992", Sex.MALE, 22);
		Person person3 = new Person("a", "11/12/1993", Sex.MALE, 23);
		Person person4 = new Person("ad", "11/12/1994", Sex.MALE, 24);
		Person person5 = new Person("e", "11/12/1993", Sex.MALE, 25);
		List<Person> arrayList = new ArrayList<Person>();
		arrayList.add(person1);
		arrayList.add(person2);
		arrayList.add(person3);
		arrayList.add(person4);
		arrayList.add(person5);
		arrayList.add(0,person4);
		
		//using sort
		System.out.println("ArrayList with sorting");
		Collections.sort(arrayList);
		//Collections.sort(arrayList,new  PersonComparator());
		
		//arrayList
		System.out.println("ArrayList");
		for(Person person : arrayList){
			System.out.print(person.toString());
		}
		
		//linkedlist
		System.out.println("\nLinkedList");
		LinkedList<Person> linkList = new LinkedList<Person>();
		linkList.addAll(arrayList);
		System.out.println(linkList.toString());
		
		
		
		//using hashset
		System.out.println("\nHashSet");
		HashSet<Person> hashSet= new HashSet<Person>();
		hashSet.addAll(arrayList);
		
		
		for(Person person : hashSet){
			System.out.print(person.toString());
		}
				//using treeset
		System.out.println("\nTreeSet");
		//TreeSet<Person> treeSet = new TreeSet<Person>() ;
		TreeSet<Person> treeSet = new TreeSet<Person>(new PersonComparator());
		treeSet.addAll(arrayList);
		System.out.println(treeSet.toString());
		
		//linkedhashset
		System.out.println("LinkedHashSet");
		LinkedHashSet<Person> linkedHashSet = new LinkedHashSet<Person>();
		linkedHashSet.addAll(arrayList);
		System.out.println(linkedHashSet.toString());
		//System.out.println(person1.equals(person2));
		
		
	}

}
