package com.hpe.grenoble;

import java.util.ArrayList;
import java.util.Iterator;



public class GrenobleDB {
	
	public String fname;
	  public int age;
	  public String lname;
	  public int id;
	  public GrenobleDB(int id, String fname, String lname, int age) {
	     this.id=id;
	     this.fname=fname;
	     this.lname=lname;
	     this.age=age;
	  }
	  
	public static ArrayList<GrenobleDB> dbUpdate() {
	ArrayList<GrenobleDB> arr = new ArrayList<GrenobleDB>();
	arr.add(new GrenobleDB(10, "joe","Uria",22));
	arr.add(new GrenobleDB(11, "Albert","Einstein",22));
	arr.add(new GrenobleDB(12, "Anna","K. Behrensmeyer",23));
	arr.add(new GrenobleDB(13, "Blaise","Pascal",21));
	arr.add(new GrenobleDB(14, "Caroline","Herschel",24));
	arr.add(new GrenobleDB(15, "Cecilia","Payne",20));
	arr.add(new GrenobleDB(16, "Chien","Shiung",25));
	arr.add(new GrenobleDB(17, "Max","Born",29));
	arr.add(new GrenobleDB(18, "Melissa","Franklin",27));
	arr.add(new GrenobleDB(19, "Mildred","Dresselhaus",25));
	arr.add(new GrenobleDB(20, "Niels","Bohr",23));
	
	return arr;
	  }	
	
	public static void main(String args[]){
		
		ArrayList <GrenobleDB> list=dbUpdate();
		  Iterator <GrenobleDB> it=list.iterator();
       while(it.hasNext()){
    	   GrenobleDB s1=it.next();
       	System.out.println(s1.fname);

}
	}
}
