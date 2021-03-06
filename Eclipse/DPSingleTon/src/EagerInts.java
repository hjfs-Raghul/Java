
public class EagerInts {
	//one object per JVM(system to run) instance
	
	//create private static final class instance
	private static final EagerInts instObj = new EagerInts();
	//private -> so cannot be accessible outside , cannot be instantiated
	private String value;
	
	
	
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	private EagerInts() {
		//prevents creating object from other class
	}
	public static EagerInts getInstance() {
		return instObj;
	}

	
}
