package net.myinfosys.novembertraining.IO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class ObjectStream {

	public static void main(String[] args) throws IOException,
			ClassNotFoundException {
		FileOutputStream fos = null;
		ObjectOutputStream os = null;
		FileInputStream fis = null;
		ObjectInputStream is = null;
		List<User> list = new ArrayList<User>();
		User user1 = new User("ruben", "ruben@gmail.com");
		User user2 = new User("rocky", "rocky@gmail.com");
		list.add(user1);
		list.add(user2);
		try {
			fos = new FileOutputStream("User.txt");
			os = new ObjectOutputStream(fos);
			os.writeObject(list);

		} catch (IOException e) {
			System.out.println(e.toString());
		} finally {
			fos.close();
			os.close();
		}

		System.out.println("User List");

		try {
			fis = new FileInputStream("User.txt");
			is = new ObjectInputStream(fis);
			ArrayList<User> data = new ArrayList<User>();
			User user = null;
			/*
			 * while((user = (User) is.readObject())!=null){ data.add(user); }
			 */
			System.out.println(is.readObject().toString());
			/*
			 * for(User users: data){ System.out.println(users.toString()); }
			 */
		} catch (IOException e) {
			System.out.println(e.toString());
		} finally {

			is.close();
		}
	}
}
