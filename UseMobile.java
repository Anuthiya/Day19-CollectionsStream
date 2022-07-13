package trainingday19COLLECTIONSstreams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UseMobile {
	public static void main(String args[]) {
		Mobile m1=new Mobile("Samsung","A6+",20);
		Mobile m2=new Mobile("RealMe","A20",15);
		Mobile m3=new Mobile("vv","7Pro",24);
		
		ArrayList<Mobile> mobiles=new ArrayList<>();
		mobiles.add(m1);
		mobiles.add(m2);
		mobiles.add(m3);
		List<Mobile> vow=mobiles.stream().filter(x->x.getBrand().contains("a")||x.getBrand().contains("e")||x.getBrand().contains("i")||x.getBrand().contains("o")||x.getBrand().contains("u")).collect(Collectors.toList());
		vow.forEach(x->System.out.println(x));
	}

}
