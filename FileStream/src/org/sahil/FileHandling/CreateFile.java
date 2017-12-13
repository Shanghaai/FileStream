package org.sahil.FileHandling;

import java.io.*;
import java.util.Scanner;

public class CreateFile {
	public static void main(String[] args) throws Exception {

		Scanner sc = new Scanner(System.in);
		FileOutputStream out = new FileOutputStream("C:/Users/sahil/Desktop/desktop/Resumes/New folder/test.txt");
		System.out.println("Enter the text to be stored into the file");
		
		char ch;
		while((ch = (char)sc.nextByte())!= '@');
		{
			out.write(ch);
			out.close();
		}
		System.out.println("Writing in the file has been done ");
		
		
		/*int i = 100/0;
		airthemetic exception
		System.out.println("i value"+i);*/
	}
}
//FileOutputStream is used to write data into file so oviously 
//we have to take data from keyboard
//so use DataInputStream(System.in)