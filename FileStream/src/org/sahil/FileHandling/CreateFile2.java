package org.sahil.FileHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class CreateFile2 
{
	public static void main(String[] args) throws IOException {
	FileInputStream fin = new FileInputStream("C:/Users/sahil/Desktop/Resumes/New folder/test.txt");
	int x = fin.read();
	char ch;
	
	while( (ch= (char)x) != -1);
	System.out.println(ch);
	System.out.println("data reading successfully ");
	fin.close();		
  }
}