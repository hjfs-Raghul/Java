
public class StaticBlockInts {
	
	//create private static class instance
	private static StaticBlockInts instObj;
	
	private StaticBlockInts() {
		//prevents creating object from other class
	}
	
	static {
		try {
			instObj = new StaticBlockInts();
		}
		catch(Exception ex) {
			System.out.println(ex.toString());
		}
	}
	public static StaticBlockInts getInstance() {
		return instObj;
	}
}
