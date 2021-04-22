package br.com.alura.java.io.test;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class SerializationClientInput {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
			
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("client.bin"));
		Client client = (Client) ois.readObject();
		ois.close();
		System.out.println(client.getName() + " " + client.getTfn() +" " + client.getJob());
		
	}
}
