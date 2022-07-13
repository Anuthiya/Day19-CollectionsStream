package trainingday19COLLECTIONSstreams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UseAc {
	public static void main(String args[]) {
		Ac ac1=new Ac("Samsung",48000,"White");
		Ac ac2=new Ac("Onida",42000,"Red");
		Ac ac3=new Ac("Camipro",40000,"White");
		ArrayList<Ac> acs=new ArrayList<>();
		acs.add(ac1);
		acs.add(ac2);
		acs.add(ac3);
		List <Integer> list=acs.stream().map(x->x.getPrice()+1000).collect(Collectors.toList());
		list.forEach(y->System.out.println(y));
	}

}
