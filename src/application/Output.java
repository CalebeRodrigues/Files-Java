package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import entities.Product;

public class Output {

	private Product product;

	public Output(Product product) {
		this.product = product;
	}
	
	public boolean SavedFile(String path) {
		path += "\\out\\summary.csv";
		
		try (BufferedWriter arquive = new BufferedWriter(new FileWriter(path))){
			arquive.write(product.toString());
			return true;
		}
		catch(IOException e) {
			return false;
		}
	}
}
