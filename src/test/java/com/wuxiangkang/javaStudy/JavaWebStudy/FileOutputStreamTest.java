package com.wuxiangkang.javaStudy.JavaWebStudy;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileOutputStreamTest {
	public static void main(String[] args) {
		System.out.println("hello world");
		
		byte[] buf = new byte[10];
		for (int i = 0; i < buf.length; i++) {
			buf[i] = (byte) i;
		}
		try {
			//DataOutputStream 可以传其他int  String类型
			DataOutputStream out = new DataOutputStream(
					new BufferedOutputStream(
							new FileOutputStream("a.dat")));
			int i = 123456;
			out.writeInt(i);	
			out.close();
			
			DataInputStream in = new DataInputStream(
					new BufferedInputStream(
							new FileInputStream("a.dat")));
			int j = in.readInt();
			System.out.println(j);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
