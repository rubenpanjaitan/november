package net.myinfosys.novembertraining.exceptions;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Logging {

	public static void main(String[] args){
		try{
			Handler handler = new FileHandler("test.log");
			Logger.getLogger("").addHandler(handler);
		}catch(IOException e){
			Logger logger = Logger.getLogger("package.name");
			StackTraceElement elements[] = e.getStackTrace();
			for(int i = 0 ; i < elements.length; i ++){
				logger.log(Level.WARNING, elements[i].getMethodName());
			}
		}
	}
}
