package application;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import entities.Product;

public class Output {

	private List<Product> product = new ArrayList<>();
	private String path;

	public Output(Product product, String path) throws Exception {
		boolean created = new File(path + "\\out").mkdir();
		if(!created) throw new Exception("Error creating directory!");
		this.product.add(product);
		this.path = path;
	}

	public void addProduct(Product product) {
		this.product.add(product);
	}

	public boolean SavedFile() throws IOException {
		
			try (BufferedWriter buff = new BufferedWriter(new FileWriter(path+"\\out\\summary.csv"))) {
				for (Product product : product) {
					buff.write(product.toString());
					buff.newLine();
				}
				return true;
			} catch (IOException e) {
				throw new IOException("Insertion error. Try again!");
			}
	}
}
