package br.com.alura.java.io.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class WritingTest {
	
	public static void main(String[] args) throws IOException {
	FileInputStream fis = new FileInputStream("lorem.txt");
	InputStreamReader isr = new InputStreamReader(fis);
	BufferedReader br = new BufferedReader(isr);
	
	OutputStream fos = new FileOutputStream("lorem2.txt");
	Writer osw = new OutputStreamWriter(fos);
	BufferedWriter bw = new BufferedWriter(osw);
	
	String line = br.readLine();
	
	while (line != null) {
		bw.write(line);
		bw.newLine();
		line = br.readLine();
	}
	
	
	br.close();
	bw.close();
	
	}
}
