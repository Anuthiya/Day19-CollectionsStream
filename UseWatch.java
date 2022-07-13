package trainingday19COLLECTIONSstreams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UseWatch {
	public static void main(String args[]) {
		Watch w1=new Watch("Sonata",2000,true);
		Watch w2=new Watch("Titan",5000,true);
		Watch w3=new Watch("Fastrack",4000,false);
		
		ArrayList<Watch> watches=new ArrayList<>();
		watches.add(w1);
	    watches.add(w2);
	    watches.add(w3);
	    
	    List<Integer> dis=watches.stream().map(x->(x.getPrice()-x.getPrice()*2/100)).collect(Collectors.toList());
	    dis.forEach(x->System.out.println(x));
	}

}
