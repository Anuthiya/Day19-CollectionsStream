package trainingday19COLLECTIONSstreams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class UseComputers {
	public static void main(String args[]) {
		Computers computer1=new Computers("Apple",128,true);
		Computers computer2=new Computers("MI",124,false);
		Computers computer3=new Computers("Acer",64,false);
		
		ArrayList<Computers> comps=new ArrayList<>();
		comps.add(computer1);
		comps.add(computer2);
		comps.add(computer3);
		
		List<Computers> is=comps.stream().filter(x->!x.getIsIos()==true).collect(Collectors.toList());
		is.forEach(x->System.out.println(x));
		
	}

}
