package br.com.alura.java.io.test;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WritingTestNext {
	
	public static void main(String[] args) throws IOException {
	
	BufferedWriter bw = new BufferedWriter(new FileWriter("lorem4.txt"));
	bw.write("Lorem ipsum dolor sit amet");
	bw.newLine();
	bw.newLine();
	bw.write("What a amazing day!");
		
		
	bw.close();
	
	}
}
