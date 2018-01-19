package com.jaon.cv;

import java.nio.ByteBuffer;

public class Tesdxt {
  private int  value=100; 
  private byte[] bytes= {1,2,3,4};
  private ByteBuffer  byteBuffer=ByteBuffer.wrap(bytes); 
  public int getvalue() {
	return  value;
}
  public ByteBuffer getbytebuffer() {
	return byteBuffer;
}
  private void name(int value,int vlu) {
	System.out.println(value+"v"+vlu);
  }
}
