package comparableAndComperator;

import java.util.Comparator;

public class Student implements Comparable<Student> {
	
	
	private int stdId;
	private String stdName;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int stdId, String stdName) {
		super();
		this.stdId = stdId;
		this.stdName = stdName;
	}
	
	public int getStdId() {
		return stdId;
	}

	public void setStdId(int stdId) {
		this.stdId = stdId;
	}

	public String getStdName() {
		return stdName;
	}

	public void setStdName(String stdName) {
		this.stdName = stdName;
	}

	@Override
	public String toString() {
		return "Student [stdId=" + stdId + ", stdName=" + stdName + "]";
	}

	@Override
	public int compareTo(Student o) {

		return this.stdId - o.stdId;
	}

	public static Comparator<Student> nameComparator= new Comparator<Student>() {
		
		@Override
		public int compare(Student o1, Student o2) {
			
			return o1.getStdName().compareTo(o2.getStdName());
		}
	};
	
}
