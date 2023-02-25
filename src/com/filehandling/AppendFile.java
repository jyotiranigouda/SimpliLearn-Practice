package com.filehandling;

import java.io.FileWriter;
import java.io.IOException;

public class AppendFile {

	public static void main(String[] args) {
		String File ="The File information is  modified";
		try {
		FileWriter output = new FileWriter("/home/jyotins0007gmai/pg-fsd-phase1/SimplilearnPractice/check.txt");
	output.write(File);
	output.close();
		}catch(IOException ex) {
		System.out.println("Unexpected Error");
	}}}


