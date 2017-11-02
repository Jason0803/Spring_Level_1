package com.kosta.di.impl;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import com.kosta.di.OutputBean;

public class FileOutputBeanImpl implements OutputBean {
	private String path;

	public void setPath(String path) {
		this.path = path;
	}

	@Override
	public void output(String message) {
		File outputFile = new File(path);
		FileWriter fw = null;
		try {
			fw = new FileWriter(outputFile);
			fw.write(message);
			fw.close();
		} catch (IOException e) {			
			e.printStackTrace();
		} 
	}
	
	
}
