package br.com.alura.java.io.test;

import java.io.IOException;
import java.io.PrintWriter;

public class WritingTestUltimate {
	
	public static void main(String[] args) throws IOException {
	
//	PrintStream ps = new PrintStream(new File("lorem5.txt"));
		
	PrintWriter ps = new PrintWriter("lorem5.txt");
	
	ps.println("Lorem ipsum dolor sit amet");
	ps.println();
	ps.println();
	ps.println("What a amazing day!!");
		
		
	ps.close();
	
	}
}
