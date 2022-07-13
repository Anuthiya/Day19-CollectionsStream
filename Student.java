package trainingday19COLLECTIONSstreams;

public class Student {
	private String studentName;
	private int studentId;
	private String mediumOfInstruction;
	
	public void setStudentName(String studentName) {
		this.studentName=studentName;
	}
	public void setStudentId(int studentId) {
		this.studentId=studentId;
	}
	public void setMediumOfInstruction(String mediumOfInstruction) {
		this.mediumOfInstruction=mediumOfInstruction;
	}
	public String getStudentName() {
		return studentName;
	}
	public int getStudentId( ) {
		return studentId;
	}
	public String getMediumOfInstruction() {
		return mediumOfInstruction;
	}
	public Student(String studentName, int studentId, String mediumOfInstruction) {
		this.studentName=studentName;
		this.studentId=studentId;
		this.mediumOfInstruction=mediumOfInstruction;
	}
	public String toString() {
		return studentName+" "+studentId+" "+mediumOfInstruction;
	}
}
	
