package br.com.alura.java.io.test;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Locale;
import java.util.Scanner;



public class ReadingCSV {
	
	public static void main(String[] args) throws FileNotFoundException {
		
		Scanner scanner = new Scanner(new File("contas.csv"), "UTF-8");
		
		while (scanner.hasNextLine()) {
			String line = scanner.nextLine();
//			System.out.println(line);
			
			Scanner lineScanner = new Scanner(line);
			lineScanner.useLocale(Locale.US);
			lineScanner.useDelimiter(",");
			
			String account = lineScanner.next();
			int value2 = lineScanner.nextInt();
			int number = lineScanner.nextInt();
			String costumer = lineScanner.next();
			double balance = lineScanner.nextDouble();
			
			String valueFormated = String.format(new Locale("pt", "BR"), "Informations: %s %04d-%06d %s %08.2f ",
					account, value2, number, costumer, balance);
			System.out.println(valueFormated);
			
			System.out.println("-------------------");
			
			lineScanner.close();
		}
		
	
		
		scanner.close();
	}

}
