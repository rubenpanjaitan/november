package net.myinfosys.novembertraining.IO;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutputStreamTest {
	
	public static void main(String[] args) throws IOException{
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		DataInputStream dis = null;
		DataOutputStream dos = null;
		String [] str ={"a","b","c","d"};
		int [] angka = {1,2,3,4};
		
		try{
			fos = new FileOutputStream("dos.txt");
			bos = new BufferedOutputStream(fos);
			dos = new DataOutputStream(bos);
			for(int i = 0;i<4;i++){
				dos.writeDouble(angka[i]);
				dos.writeUTF(str[i]);
			}
		}catch(IOException e){
			System.out.println(e.toString());
		}finally{			
			dos.close();
		}
		
		try{
			fis = new FileInputStream("dos.txt");
			bis = new BufferedInputStream(fis);
			dis = new DataInputStream(bis);
			int a;
			String s;
			for(int i=0;i<4;i++){
				a=(int)(dis.readDouble());
				s=dis.readUTF();
				System.out.println(a+s);
			}
		}catch(IOException e){
			System.err.println(e.toString());
		}finally{
			dis.close();
		}
		
	}

}
