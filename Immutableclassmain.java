package CustomImmutableClass;

// make class final
public final class Immutableclassmain {

	private final int roll_no;		// immutable fields make private and final
	private final String emp_name;	
	private final Referenceclass obj;	// Mutable field object

	
	public Immutableclassmain(int roll_no, String emp_name, Referenceclass obj) {
		super();
		this.roll_no = roll_no;
		this.emp_name = emp_name;
		
		Referenceclass deepcopyobject = new Referenceclass();	// create deep copy 
		deepcopyobject.setMob_no(obj.getMob_no());				// first set value in deepcopy object by using mutable object of get method.
		deepcopyobject.setStudent_name(obj.getStudent_name());
		this.obj = deepcopyobject;
	}

	public int getRoll_no() {
		return roll_no;
	}

	public String getEmp_name() {
		return emp_name;
	}

	public Referenceclass getObj() {
		Referenceclass dumyobject = new Referenceclass();
		dumyobject.setMob_no(this.obj.getMob_no());
		dumyobject.setStudent_name(this.obj.getStudent_name());
		return dumyobject;
	}

	@Override
	public String toString() {
		return "Immutableclassmain [roll_no=" + roll_no + ", emp_name=" + emp_name + ", obj=" + obj + "]";
	}
	
	







}
