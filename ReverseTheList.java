package sampleprogram;

import java.util.List;
import java.util.ArrayList;

public class ReverseTheList {
	
	String reverse="";

	public static void main(String[] args) {
		List<String> list=new ArrayList<>();
		list.add("Red");
		list.add("Green");
		list.add("Blue");
		list.add("yellow");
		list.add("Brown");
		
		int size=list.size();
		for(int i=size-1;i>=0;i--) {
			String ListValues=list.get(i);
		
		
		System.out.println("The reverse of string is:" +ListValues);

	}

}

}
