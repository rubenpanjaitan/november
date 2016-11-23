package net.myinfosys.novembertraining.exceptions;

public class StackException {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = new int[2];
		try{
			System.out.println("element"+ a[3]);
		}catch(Exception e){
			StackTraceElement elements [] = e.getStackTrace();
			for(int i =0 ; i< elements.length; i ++){
				System.err.println(elements[i].getFileName()
			            + ":" + elements[i].getLineNumber() 
			            + ">> "
			            + elements[i].getMethodName() + "()");
			}
			//System.err(e.printStackTrace());
		}

	}
}
