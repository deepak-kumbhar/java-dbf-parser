package com.dk.javadbfparser.bug50list2dbf;

import java.io.FileOutputStream;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import com.dk.javadbfparser.DBFDataType;
import com.dk.javadbfparser.DBFField;
import com.dk.javadbfparser.DBFUtils;
import com.dk.javadbfparser.DBFWriter;

public class Bug50ExampleListToDBF {
	
	public Bug50ExampleListToDBF () {
		super();
	}
	
	/**
	 * This example shows how to export a List of integers to a DBF file
	 * https://github.com/albfernandez/javadbf/issues/50
	 */
	@Test
	public void listOfIntegerToDBF() throws Exception {
		
		// List of integer to export
		List<Integer> integers = Arrays.asList(new Integer[] {1,5,7,12,5,2});
		
		// Defining the field in the dbf
		DBFField[] fields = new DBFField[1];

		fields[0] = new DBFField();
		fields[0].setName("code");
		fields[0].setType(DBFDataType.NUMERIC);
		fields[0].setLength(10);
		// Create writer
		DBFWriter writer = null;
		try {
			writer = new DBFWriter(new FileOutputStream("target/example50.dbf"));
			writer.setFields(fields);
			
			// writing all the integers to the file
			for (Integer integer : integers) {
				writer.addRecord(new Object[] {integer});
			}
		}
		finally {
			DBFUtils.close(writer);
		}
	}

}
