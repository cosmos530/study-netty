package com.study.chapter01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * example 1.1
 */
public class BlockingIOExample {
	public static int portNumber = 8080;
	
	public void blockingIOExample() throws IOException {
		ServerSocket serverSocket = new ServerSocket(portNumber);
		Socket clientSocket = serverSocket.accept();
		BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
		PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
		
		String request, response;
		while ((request = in.readLine()) != null) {
			if( "Done".equals(request)) {
				break;
			}
			
//			response = processRequest(request);
			response = request;
			
			out.print(response);
		}
	}
}
