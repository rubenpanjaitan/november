package net.myinfosys.novembertraining.IO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class EncodeFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = null;
		FileWriter unix = null;
		FileWriter mac = null;
		String text;
		
		try{
			br = new BufferedReader(new FileReader("windows.txt"));
			unix = new FileWriter("unix.txt");
			mac = new FileWriter("mac.txt");
			while((text = br.readLine())!= null){
				unix.write(text+"\n");
				mac.write(text+"\r");
			}
			
		}catch(IOException e){
			System.out.println(e.toString());
		}finally{
			br.close();
			unix.close();
			mac.close();
		}
	}

}
