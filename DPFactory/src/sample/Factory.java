package sample;

public class Factory{
	
	public Products CreateObject(String pName) {
		if(pName.equalsIgnoreCase("human"))
				return new Human();
			return new Machine();
		}
	
	

}
