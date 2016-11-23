package net.myinfosys.novembertraining.IO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ByteStream {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		Path path = Paths.get("");
		String directory = path.toAbsolutePath().toString();
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try{
			fis = new FileInputStream(directory+"/byte_input.txt");
			fos = new FileOutputStream(directory+"/byte_output.txt");
			int count;
			while((count = fis.read())!= -1){
				fos.write(count);
			}
		}catch(IOException e){
			System.out.println("file not found"+ e.toString());
		}finally{
			fis.close();
			fos.close();
		}
	
	}

}
