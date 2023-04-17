package CustomImmutableClass;

public class Referenceclass {
	
	int mob_no;
	String student_name;
	
	public Referenceclass() {
		super();
	}

	public Referenceclass(int mob_no, String student_name) {
		super();
		this.mob_no = mob_no;
		this.student_name = student_name;
	}

	public int getMob_no() {
		return mob_no;
	}

	public void setMob_no(int mob_no) {
		this.mob_no = mob_no;
	}

	public String getStudent_name() {
		return student_name;
	}

	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}

	@Override
	public String toString() {
		return "Referenceclass [mob_no=" + mob_no + ", student_name=" + student_name + "]";
	}


	
	

}
