package net.myinfosys.novembertraining.IO;

import java.io.Console;
import java.util.logging.ConsoleHandler;

public class ConsolePassword {
	
	public static void main(String[] args){
		
		Console console = System.console();
		/*if(console == null){
			System.err.println("no console");
			System.exit(1);
		}
		*/
		String login = console.readLine("Enter your login");
	}

}
