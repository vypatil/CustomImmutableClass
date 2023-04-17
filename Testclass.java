package CustomImmutableClass;

public class Testclass {

	public static void main(String[] args) {
	
		Referenceclass r1 = new Referenceclass(721841, "vaibhav");
		
		Immutableclassmain i1 = new Immutableclassmain(16, "ram", r1);
		
		System.out.println(i1);
		System.out.println(r1);
		
		r1.setMob_no(555);
		System.out.println(r1);
		
	}
	
}
