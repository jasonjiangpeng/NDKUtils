package com.jaon.cv;

import java.util.Base64;
import java.util.LinkedList;
import java.util.Queue;

public class CompressDigitalString {
	public static class ThreadTest1 extends Thread{  
	        String a;  
	        public ThreadTest1(String a){  
	            this.a=a;  
	        }  
	  
	        public void run(){  
	            try {  
	            	System.out.println("======");
	             System.out.println(	Thread.currentThread().getName());
	            	synchronized (a) {
	            	       a.wait();  
					}
	         
	            	System.out.println("====xxxx==");
	            } catch (InterruptedException e) {  
	  
	            }  
	        }  
	    }  
	  
	    public static void main(String[] args){  
	        String a="11";  
	        boolean  inrun=true;
	        ThreadTest1 test = new ThreadTest1(a);  
	        Thread  thread =new Thread() {
	        	@Override
	        	public void run() {
	        		int  c=0;
	        		while (inrun) {
	    			   System.out.println(test.getState().name());
	    			   try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
	    			   c++;
	    			   if (c>20) {
	    				   synchronized (a) {
	    					   a.notifyAll();
						}
	    				  if (test.getState().name().equals("TERMINATED")) {
	    					  test.run();
	    					  
						} 
	    				 
						
					}
	    			   
					}
	        	}
	        };
	       thread.start();
	
	       
	        test.start(); 
        
	    }  
	

  
}
