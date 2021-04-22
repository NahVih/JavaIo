package br.com.alura.java.io.test;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationClientOutput {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		Client client = new Client();
		client.setName("Salvador");
		client.setJob("Dev");
		client.setTfn("12785495840");
			
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("client.bin"));
		
		oos.writeObject(client);
		oos.close();
		
	}
}
