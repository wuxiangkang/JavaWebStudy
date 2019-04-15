package com.wuxiangkang.javaStudy.JavaWebStudy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class SocketTest {
	public static void main(String[] args) {
		try {
			Socket socket = new Socket(InetAddress.getByName("localhost"), 12345);
			//写
			PrintWriter out = new PrintWriter(
					new BufferedWriter(
							new OutputStreamWriter(
									socket.getOutputStream())));
			out.println("hello");
			out.flush();
			
			//读
			BufferedReader in = new BufferedReader(
					new InputStreamReader(
							socket.getInputStream()));
			String line;
			line = in.readLine();
			System.out.println(line);
			out.close();
			socket.close();
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
