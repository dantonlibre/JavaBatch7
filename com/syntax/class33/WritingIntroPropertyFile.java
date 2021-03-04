package com.syntax.class33;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class WritingIntroPropertyFile {

	public static void main(String[] args) throws IOException {
		
		String file="configs\\Example.properties";
		FileInputStream fis= new FileInputStream(file);
		
		Properties p = new Properties();
		p.load(fis);
		
		p.setProperty("street", "New Brook Drive");
		
		String newFile="configs\\\\Example.properties";
		
		FileOutputStream fos = new FileOutputStream(file);
		
		p.store(fos, "added additional key");
		
		
		
	}
	
	
	
}
