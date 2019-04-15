package com.wuxiangkang.javaStudy.JavaWebStudy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class WriteTest {
	public static void main(String[] args) {
System.out.println("hello world");
		
		byte[] buf = new byte[10];
		for (int i = 0; i < buf.length; i++) {
			buf[i] = (byte) i;
		}
		try {
			//DataOutputStream 可以传其他int  String类型
			PrintWriter out = new PrintWriter(
					new BufferedWriter(
							new OutputStreamWriter(
									new FileOutputStream("a.txt"))));
			int i = 123456;
			out.println(i);
			out.close();
			
			BufferedReader in = new BufferedReader(
					new InputStreamReader(
							new FileInputStream("a.txt")));
			String line;
			while((line=in.readLine())!=null) {
				System.out.println(line);
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
