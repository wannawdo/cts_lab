package ro.ase.acs.seminar6.builder;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;

public class TechProductFactory extends AbstractProductFactory {

	@Override
	public Product makeProduct() throws UnsupportedOperationException {
		return new TechProduct("generic");
	}

	@Override
	public String getCatalog() {
		ArrayList<String> records = readRecordFromFile("tech_products.csv");
		StringBuilder builder = new StringBuilder();
		for (String record : records) {
			String[] productAttributes = record.split(",");
			builder.append(productAttributes[0] + " - ");
			builder.append(productAttributes[1] + " ").append(productAttributes[2] + " ").append(productAttributes[3]+"\n");
		}
		return builder.toString();
	}

	private ArrayList<String> readRecordFromFile(String fileName) {
		ArrayList<String> records = new ArrayList<String>();

		URL fileUrl = getClass().getResource(fileName);
		File productsFile = new File(fileUrl.getPath());
		try {
			BufferedReader reader = new BufferedReader(new FileReader(productsFile));
			String line;
			try {
				while ((line = reader.readLine()) != null) {
					records.add(line);
				}
				reader.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return records;
	}
}