package org.sahil.FileHandling;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Serializable;

public class FileWriter1 {
	
	public static void main(String[] args) throws IOException {
	
		FileWriter fr = new FileWriter("C:/Users/sahil/Desktop/Resumes/New folder/test.txt");
		String str = "hey buddy how you ? i was hoping to get some rest..i hope ill get it sooon ";
		fr.write(str);
		fr.close();
		{
			System.out.println("Data inserted successfully ");
		}
   }
}
