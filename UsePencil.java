package trainingday19COLLECTIONSstreams;

import java.util.ArrayList;

public class UsePencil {
	public static void main(String args[]) {
		Pencil p1=new Pencil("Apsara",10,"2HB");
		Pencil p2=new Pencil("Natraj",20,"2HB");
		Pencil p3=new Pencil("Camlin",30,"HB");
	
		ArrayList<Pencil> pencils=new ArrayList<>();
		pencils.add(p1);
		pencils.add(p2);
		pencils.add(p3);
		
		long hbcount=pencils.stream().filter(x->x.getShade().equals("HB")).count();
		System.out.println(hbcount);
		//long hbcount=pencils.stream().map(x->x.getShade().equals("HB")).count();
		//System.out.println(hbcount);
		
		
	}

}
