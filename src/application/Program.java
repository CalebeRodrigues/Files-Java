package application;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) throws IOException {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		Output output;
		
		System.out.print("Enter a folder path: ");
		String path = scanner.nextLine();
		
		
		System.out.println("Enter the data respectively (#Name, #Price, #Quantity):");
		String source = scanner.nextLine();
		
		
		try {
				
			output = new Output(new Product(source),path);
							
			System.out.println("Want to add another product? (y/n)");
			char resul = scanner.next().charAt(0);
			boolean teste = (resul == 'y') ? true : false;
			
			while(teste) {
				System.out.println("Enter the data respectively (#Name, #Price, #Quantity):");
				scanner.nextLine();
				source = scanner.nextLine();
				
				output.addProduct(new Product(source));
				
				System.out.println("Want to add another product? (y/n)");
				resul = scanner.next().charAt(0);
				teste = (resul == 'y') ? true : false;
			}
			
			output.SavedFile();
			
			System.out.println("Successfully completed!");
				
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println();
		}
		finally {
			scanner.close();
		}
		
	}

}
