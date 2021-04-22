package br.com.alura.java.io.test;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationOOS {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		String name = "Salvador V Baptista";
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("object.bin"));
		
		oos.writeObject(name);
		oos.close();
		
	}
}
