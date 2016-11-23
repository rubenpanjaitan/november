package net.myinfosys.novembertraining.collection;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

public class ArrayListTest {
	
	ArrayList<String> listSong = new ArrayList<String>();
	public static void main(String [] args){
		new ArrayListTest().go();
	}
	
	public void getSongs(){
		try{
			File file = new File("Song.txt");
			//System.out.print(file.getAbsolutePath());
			BufferedReader bf = new BufferedReader(new FileReader(file));
			String line = null;
			while((line = bf.readLine())!= null){
				addSong(line);
			}
			
		}catch(Exception ex){
			ex.printStackTrace();
		}
	}

	private void addSong(String line) {
		// TODO Auto-generated method stub
		String [] tokens = line.split("/");
		listSong.add(tokens[0]);
	}
	
	private void go(){
		getSongs();
		System.out.println(listSong);
	}

}
