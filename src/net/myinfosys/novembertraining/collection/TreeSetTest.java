package net.myinfosys.novembertraining.collection;

import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String [] args){
		new TreeSetTest().go();
	
		
	}
	
	public void go(){
		Book book1 = new Book("satu");
		Book book2 = new Book("dua");
		Book book3 = new Book("tiga");
		Book book4 = new Book("tiga");
		
		TreeSet<Book> treeSet = new TreeSet<Book>();
		treeSet.add(book3);
		treeSet.add(book2);
		treeSet.add(book1);
		System.out.println(treeSet.toString());
	}
	
	class Book implements Comparable{
		String title;
		
		public Book(String title){
			this.title = title;
		}

		@Override
		public int compareTo(Object o) {
			// TODO Auto-generated method stub
			Book book = (Book) o;
			return (title.compareTo(book.title));
		}

		@Override
		public String toString() {
			return "Book [title=" + title + "]";
		}
		
		
	}
}
