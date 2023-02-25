package com.filehandling;

import java.io.File;
import java.io.IOException;

public class FileHandling {

	public static void main(String[] args) {
		File File1=new File("/home/jyotins0007gmai/pg-fsd-phase1/SimplilearnPractice/check.txt");
try {
	if(File1.createNewFile()) 
	{
		System.out.println("The file"+File1.getName()+"  is created succesfully");
	}
} catch (IOException e) {
	System.out.println("Exception occured during file creation");
}
	}

}
