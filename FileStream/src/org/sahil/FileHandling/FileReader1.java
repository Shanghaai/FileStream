package org.sahil.FileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import java.io.IOException;

public class FileReader1 {
	public static void main(String[] args) throws Exception 
	{
		FileReader fr = new FileReader("C:/Users/sahil/Desktop/Resumes/New folder/test.txt");
		
		int x = fr.read();
		String s1 = " ";
		
		while(x != -1)//goes at the end of text file
		{
			char ch = (char)x;
			s1 = s1+ch;
			int x1 = fr.read();
		}
		
		System.out.println(s1);
		fr.close();
	}
}