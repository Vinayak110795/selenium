package com.jbk;

import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class CreateJsonfile {
	@SuppressWarnings ("unckecked")
	public static void main(String[] args) {
JSONObject obj=new 	JSONObject();
obj.put("name","ankush");
obj.put("location","Nagpur");

JSONArray  list=new JSONArray();
list.add("java");
list.add("selenium");
list.add("J2EE");
obj.put("courses", list);
try(FileWriter file=new FileWriter("e:/myJson.json")) {
	file.write(obj.toString());
	file.flush();
}catch(IOException e) {
	e.printStackTrace();
}
System.out.println(obj);




	
	
	
	
	
	
	
	
	
	
	
	}
	}
