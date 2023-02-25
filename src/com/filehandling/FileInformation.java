package com.filehandling;

import java.io.File;

public class FileInformation {
	

	public static void main(String[] args) {


	File File1= new File("/home/jyotins0007gmai/pg-fsd-phase1/SimplilearnPractice/check.txt");
	
		
		if(File1.exists()) {
			System.out.println(File1.getName());
			System.out.println(File1.getAbsolutePath());
			System.out.println(File1.canRead());
			System.out.println(File1.canWrite());
			System.out.println(File1.length());
		}
			else
			{
				System.out.println("File doesnot exsist");
				
	}}}


