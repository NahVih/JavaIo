package br.com.alura.java.io.test;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class SerializationOIS {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("object.bin"));
		String name = (String) ois.readObject();
		System.out.println(name);
		ois.close();
	}
}
