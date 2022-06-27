package sampleprogram;

import java.util.List;
import java.util.ArrayList;

public class EvenNumbers {
	int num;

	public static void main(String[] args) {
		List<Integer> l=new ArrayList<Integer>();
		l.add(1);
		l.add(12);
		l.add(22);
		l.add(34);
		l.add(31);
		l.add(97);
		l.add(1154);
		l.add(32);
		l.add(2445);
		l.add(57);
		l.add(88);
		System.out.println(l);
		
		
		for(int i=0;i<l.size();i++) {
			int num=l.get(i);
		
		
		if(num%2==0) {
		
		System.out.println("The Even Numbers are:" +num);

	}

	}
	}
}

