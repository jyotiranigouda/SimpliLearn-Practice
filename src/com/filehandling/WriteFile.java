package com.filehandling;

import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {

	public static void main(String[] args) {
		try {
			FileWriter Fwriter =new FileWriter("/home/jyotins0007gmai/pg-fsd-phase1/SimplilearnPractice/check.txt");
		
		Fwriter.write("Hiii My Name Is Jyoti and i like coding");
		Fwriter.close();
		System.out.println("the content is sucessfully written inside the file");
		
		
		} catch (IOException e) {
         System.out.println("Unexpected error occured");
			e.printStackTrace();
		}

	}

}
