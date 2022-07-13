package trainingday19COLLECTIONSstreams;

import java.util.ArrayList;

public class ArrayLists {
	public static void main(String args[]) {
		ArrayList<Integer> a=new ArrayList<>();
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(4);
		
		ArrayList<Integer> b=new ArrayList<>();
		for(Integer i:a) {
			if(i>2) {
              b.add(i);
			}
		}
		
		System.out.println(a);
		System.out.println(b);
		
}
}