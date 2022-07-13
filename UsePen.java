package trainingday19COLLECTIONSstreams;

import java.util.ArrayList;

public class UsePen {
	public static void main(String args[]) {
		Pen pen1=new Pen("Reynolds",5,"Blue");
		Pen pen2=new Pen("Camlin",10,"Black");
		Pen pen3=new Pen("Doms",8,"Red");
		
		ArrayList<Pen> pens=new ArrayList<>();
		pens.add(pen1);
		pens.add(pen2);
		pens.add(pen3);
		
		Long notBlueCount=pens.stream().filter(x->!x.getColor().equalsIgnoreCase("Blue")).count();
		System.out.println(notBlueCount);
	}

}
