package com.filehandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {

	public static void main(String[] args) {
		
 File File1= new File("/home/jyotins0007gmai/pg-fsd-phase1/SimplilearnPractice/check.txt");
 try {
 Scanner fileReader =new Scanner(File1);
 while(fileReader.hasNextLine()) {
	 String fileData=fileReader.nextLine();
	 System.out.println(fileData);
 }fileReader.close();
 }catch (FileNotFoundException e) {
			e.printStackTrace();
		}}}
 
 
	
	


