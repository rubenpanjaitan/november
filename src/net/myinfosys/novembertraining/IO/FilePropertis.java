package net.myinfosys.novembertraining.IO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class FilePropertis {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Properties propertis = null;
		FileOutputStream fos = null;
		FileInputStream fis = null;
		
		try{
			propertis = new Properties();
			fos = new FileOutputStream("user.propertis");
			propertis.setProperty("nama", "ruben");
			propertis.setProperty("id", "if313107");
			propertis.store(fos, "propertis file");
		}catch(IOException e){
			System.out.println(e.toString());
		}finally{
			fos.close();
		}
		
		
		//reading file propertis
		try{
			fis = new FileInputStream("user.propertis");
			propertis.load(fis);
			System.out.println(propertis.getProperty("nama"));
			System.out.println(propertis.getProperty("id"));
		}catch(IOException e){
			System.out.println(e.toString());
		}finally{
			fis.close();
		}
		
	}

}
