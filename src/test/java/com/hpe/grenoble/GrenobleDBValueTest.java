package com.hpe.grenoble;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Iterator;

import org.junit.Test;


public class GrenobleDBValueTest {

	@Test
	public void test() {
ArrayList<GrenobleDB> list= GrenobleDB.dbUpdate();
        
        Iterator <GrenobleDB> it=list.iterator();
        GrenobleDB s1=it.next();
		String[] actual = {String.valueOf(s1.id), s1.fname,s1.lname,String.valueOf(s1.age)};
		String[] expected= {"10", "joe","Uria","22"};
		assertArrayEquals(actual,expected);
	}

}
