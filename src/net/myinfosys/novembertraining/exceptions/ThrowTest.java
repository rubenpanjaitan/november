package net.myinfosys.novembertraining.exceptions;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

public class ThrowTest{

	public static void main(String[] args) throws TimeoutException{
		// TODO Auto-generated method stub
		int a = 1;
		if(a != 3){
			
			throw new TimeoutException("error");
		}else{
			System.out.println(true);
		}
		
	}

}
