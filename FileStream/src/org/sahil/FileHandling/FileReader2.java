package org.sahil.FileHandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReader2 {
	
	public static void main(String[] args) throws IOException {
		
		FileReader fr = new FileReader("C:/Users/sahil/Desktop/Resumes/New folder/test.txt");
		BufferedReader br = new BufferedReader(fr);
		
		String line = br.readLine();
		while(line != null)
		{
			System.out.println(line);
		}
		br.close();
	}

}
