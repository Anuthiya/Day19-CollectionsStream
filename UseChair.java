package trainingday19COLLECTIONSstreams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UseChair {
	public static void main(String args[]) {
		Chair c1=new Chair("Flair",2000,"plastic");
		Chair c2=new Chair("Aero",1000,"cushion");
		Chair c3=new Chair("Dynamic",500,"Plastic");
		
		ArrayList<Chair> chairs=new ArrayList<>();
		chairs.add(c1);
		chairs.add(c2);
		chairs.add(c3);
		List<String> plas=chairs.stream().filter(x->x.getMaterial().equalsIgnoreCase("plastic")).map(y->y.getBrand()).collect(Collectors.toList());
		plas.forEach(z->System.out.println(z));
	}

}
