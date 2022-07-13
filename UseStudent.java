package trainingday19COLLECTIONSstreams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class UseStudent {
	public static void main(String args[]) {
		Student student1=new Student("Jeeva",223,"Tamil");
		Student student2=new Student("Kavin",227,"English");
		Student student3=new Student("MAnav",239,"English");
		ArrayList<Student> students=new ArrayList<>();
		students.add(student1);
		students.add(student2);
		students.add(student3);
		
		List <Student> listOfStudents = students.stream().filter(filteredStudent->filteredStudent.getMediumOfInstruction().equalsIgnoreCase("English")).collect(Collectors.toList());
		listOfStudents.forEach(newlist->System.out.println(newlist));
	}

}
