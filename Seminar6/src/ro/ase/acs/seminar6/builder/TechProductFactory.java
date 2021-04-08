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
	public Product makeProduct(int id) throws UnsupportedOperationException {
		ArrayList<String> records = readRecordsFromFile("tech_products.csv");
		for (String record : records) {
			String[] productArrtributes = record.split(",");
			if (Integer.valueOf(productArrtributes[0]) == id) {
				TechProduct.TechProductBuilder productBuilder = new TechProduct.TechProductBuilder(id);
				return productBuilder.setName(productArrtributes[1]).setManufacturer(productArrtributes[2])
						.setModel(productArrtributes[3]).setPrice(Float.valueOf(productArrtributes[5])).getProduct();
			}
		}
		return new TechProduct.TechProductBuilder(id).getProduct();

	}

	@Override
	public String getCatalog() {
		ArrayList<String> records=readRecordsFromFile("tech_products.csv");
		StringBuilder builder= new StringBuilder();
		for(String record:records) {
			String[] productArrtributes=record.split(",");
			builder.append(productArrtributes[0]+ " - ");
			builder.append(productArrtributes[1]+" - ")
			.append(productArrtributes[2]+" ")
			.append(productArrtributes[3]+"\n");
		}
		return builder.toString();
	}
	
	private ArrayList<String> readRecordsFromFile(String fileName){
		ArrayList<String> records=new ArrayList<String>();
		System.out.println("Reading product records...");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		
		URL fileUrl=getClass().getResource(fileName);
		File productsFile=new File( "D:\\Facultate\\Anul 3 semestrul 2\\Oana\\CTS\\cts_lab\\Seminar6\\bin\\ro\\ase\\acs\\seminar6\\builder\\"+fileName);
		try {
			BufferedReader reader=new BufferedReader(new FileReader(productsFile));
			String line;
			try {
				while((line=reader.readLine())!=null) {
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
		System.out.println("Finished reading product");
		
		return records;
	}


}
