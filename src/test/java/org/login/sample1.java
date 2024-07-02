package org.login;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import io.cucumber.core.internal.com.fasterxml.jackson.core.exc.StreamReadException;
import io.cucumber.core.internal.com.fasterxml.jackson.databind.DatabindException;
import io.cucumber.core.internal.com.fasterxml.jackson.databind.ObjectMapper;

public class sample1 {
	public static void main(String[] args) throws StreamReadException, DatabindException, IOException {
		
		FileReader fileReader  = new FileReader(new File
				("C:\\Users\\VENKATESH TN\\eclipse-workspace\\JSON\\src\\test\\resources\\sample1.json"));
	
		
	}

}
