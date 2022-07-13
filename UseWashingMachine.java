package trainingday19COLLECTIONSstreams;

import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.List;

public class UseWashingMachine {
	public static void main(String args[]) {
		WashingMachine w1=new WashingMachine("LG",20000,"Automatic");
		WashingMachine w2=new WashingMachine("Bosch",30400,"Automatic");
		WashingMachine w3=new WashingMachine("Whirlpool",40000,"SemiAutomatic");
		
		ArrayList<WashingMachine> wash=new ArrayList<>();
		wash.add(w1);
		wash.add(w2);
		wash.add(w3);
		List<WashingMachine> auto=wash.stream().filter(x->x.getPrice()>30000&&x.getPrice()<40000&&x.getType().equals("Automatic")).collect(Collectors.toList());
		auto.forEach(x->System.out.println(x));
	}

}
