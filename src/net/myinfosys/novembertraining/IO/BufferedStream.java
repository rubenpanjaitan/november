package net.myinfosys.novembertraining.IO;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class BufferedStream {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileOutputStream fout = new FileOutputStream("bos.txt");
		BufferedOutputStream bos = new BufferedOutputStream(fout);
		String s = "Indonesia Merah Putih ";
		byte b[] = s.getBytes();
		
		try {
			fout = new FileOutputStream("bos.txt");
			bos = new BufferedOutputStream(fout);
			bos.write(b);
		} catch (IOException e) {
			System.out.println(e.toString());
		} finally {
			bos.close();
			fout.close();
		}

		// buffered input stream
		FileInputStream fis = null;
		BufferedInputStream bis = null;

		try {
			fis = new FileInputStream("bos.txt");
			bis = new BufferedInputStream(fis);
			int i;
			while ((i = bis.read()) != -1) {
				System.out.print(Character.toChars(i));
			}
		} catch (IOException e) {
			System.out.println(e.toString());
		} finally {
			fis.close();
			bis.close();
		}
	}

}
