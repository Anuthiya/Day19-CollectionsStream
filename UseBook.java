package trainingday19COLLECTIONSstreams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UseBook {
	public static void main(String args[]) {
		Book book1=new Book("PonniyinSelvan","Kalki",800);
		Book book2=new Book("EC-I","Bakshi",250);
		Book book3=new Book("Thinking in Java","BruceEckel",600);
		ArrayList<Book> books=new ArrayList<>();
		books.add(book1);
		books.add(book2);
		books.add(book3);
		List<String> list=books.stream().filter(x->x.getPrice()>500).map(y->y.getTitle().toUpperCase()).collect(Collectors.toList());
		list.forEach(a->System.out.println(a));
		//System.out.println(list);
		
	}

}
