package com.dk.javadbfparser.bug37;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

import org.junit.Test;

import com.dk.javadbfparser.DBFReader;
import com.dk.javadbfparser.DBFRow;
import com.dk.javadbfparser.DBFUtils;

public class Bug37Test {

	public Bug37Test() {
		super();
	}

	@Test
	public void testBug37() throws Exception {
		DBFReader dbfReader = null;
		InputStream in = null;
		File input = new File ("src/test/resources/bug-37/agencias.dbf");
		File memoFile = new File ("src/test/resources/bug-37/AGENCIAS.DBT");
		try {
			in = new BufferedInputStream(new FileInputStream(input));
			dbfReader = new DBFReader(in);
			dbfReader.setMemoFile(memoFile);
			DBFRow row = null;
			while ( ( row = dbfReader.nextRow() )  != null) {
				System.out.println("row=" + row);
			}
			
		}
		finally {
			DBFUtils.close(dbfReader);
			DBFUtils.close(in);
		}
		
	}
}
