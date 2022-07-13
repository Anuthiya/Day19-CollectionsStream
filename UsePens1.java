package trainingday19COLLECTIONSstreams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UsePens1 {
	public static void main(String args[]) {
		Pens1 p1=new Pens1("Flair",20,true);
		Pens1 p2=new Pens1("Renolds",15,true);
		Pens1 p3=new Pens1("Parker",90,true);
		Pens1 p4=new Pens1("Cello",5,false);
		String a="";
	    int max=0;
		ArrayList<Pens1> pes=new ArrayList<>();
		pes.add(p1);
		pes.add(p2);
		pes.add(p3);
		pes.add(p4);
		
		List<Pens1> len=pes.stream().filter(x->x.getPrice()>10&&x.getIsRefillable()==true).collect(Collectors.toList());

		for(Pens1 z:len) {
			if(max<z.getBrand().length()) {
				max=z.getBrand().length();
		  a=z.getBrand();
			}
			
		}
		System.out.println(a);
	}

}
