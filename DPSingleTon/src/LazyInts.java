
public class LazyInts {
	
	//create private static class instance
	private static LazyInts instObj;
	
	private LazyInts() {
		//prevents creating object from other class
	}
	
	public static LazyInts getInstance() {
		if (instObj == null)
			instObj = new LazyInts();
		return instObj;
	}
}


