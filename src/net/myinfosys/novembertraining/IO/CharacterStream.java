package net.myinfosys.novembertraining.IO;


import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;


public class CharacterStream {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Path directory = Paths.get("");
		String path = directory.toAbsolutePath().toString();
		FileReader fr = null;
		FileWriter fw = null;
		
		try{
			fr = new FileReader("char_input.txt");
			fw = new FileWriter("char_output.txt");
			int c;
			while((c=fr.read())!=-1){
				fw.write(c);
			}
		}catch(IOException e){
			System.out.println("File not found :"+e.toString());
		}finally{
			fw.close();
			fr.close();
		}
	}

}
