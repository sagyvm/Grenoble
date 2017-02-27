package com.hpe.grenoble;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;


public class GrenobleDbArrayTest {

	@Test
	public void test() {
		
			ArrayList  test=GrenobleDB.dbUpdate();
	        assertNotNull(test);
	}

}
