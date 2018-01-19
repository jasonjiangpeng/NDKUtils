package com.jaon.cv;

public class Testm {
   public static void main(String[] args) {
	System.out.println("===========");
		 if(11>3) {
			   try {
				throw new Myname();
			} catch (Myname e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		   }
	System.out.println("=====xxxxx======");
	  
}
    public static class Myname extends Exception {
		
	}
}
