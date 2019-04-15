package com.wuxiangkang.javaStudy.JavaWebStudy;

import java.io.IOException;
import java.io.OutputStream;
import java.util.Scanner;
import java.util.concurrent.SynchronousQueue;

/**
 * 流，都是单项的。
 * @author Administrator
 *
 */
public class Stream {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		//创建一个缓存数组。
		byte[] buffer = new byte[1024];
		//读缓存
		try {
			int len = System.in.read(buffer);
			String s = new String(buffer, 0, len);
			System.out.println("读到了"+len+"字节");
			System.out.println(s);
			//回车两个字节
			System.out.println("s的长度是："+s.length());
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	
}
