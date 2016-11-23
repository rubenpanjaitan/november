package net.myinfosys.novembertraining.IO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class CharacyerLinesStream {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = null;
		PrintWriter pw = null;

		try {
			br = new BufferedReader(new FileReader("Input.txt"));
			pw = new PrintWriter(new FileWriter("Output.txt"));
			String str;
			while ((str = br.readLine()) != null) {
				
				pw.println(str+"|");
			}
		} catch (IOException e) {
			System.out.println(e.toString());
		} finally {
			br.close();
			pw.close();
		}
	}

}
