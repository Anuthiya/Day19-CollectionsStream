package trainingday19COLLECTIONSstreams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UseCamera {
	public static void main(String args[]) {
		Camera c1=new Camera("Canon",20000);
		Camera c2=new Camera("Linen",30000);
		Camera c3=new Camera("Disc",40000);
		
		ArrayList<Camera> cams=new ArrayList<>();
		cams.add(c1);
		cams.add(c2);
		cams.add(c3);
		List<Character> Fletter=cams.stream().map(x->x.getBrand().charAt(0)).collect(Collectors.toList());
		Fletter.forEach(x->System.out.println(x));
	}

}
