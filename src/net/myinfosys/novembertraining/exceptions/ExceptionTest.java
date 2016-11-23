package net.myinfosys.novembertraining.exceptions;

import javax.management.RuntimeErrorException;

public class ExceptionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = new int[2];
		/*try{
			System.out.println("element"+ a[3]);
		}catch(Exception e){
			System.out.println("error message "+ e);
			//System.err(e.printStackTrace());
		}*/
		 throw new  RuntimeErrorException(null, "error");
	}

}
