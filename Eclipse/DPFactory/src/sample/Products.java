package sample;


public class Products implements Attributes{
	private String name;
	private double height , weight;
	
	Products Products(String pName) {
		if(pName.equalsIgnoreCase("human"))
			return new Human();
		return new Machine();
	}

	@Override
	public void setName(String name) {
		this.name = name;
		
	}

	public String getName() {
		return this.name;	
	}
	
	@Override
	public void setHeight(double height) {
		this.height = height;
	}
	
	public double getHeight() {
		
		return this.height;	
	}

	@Override
	public void setWeight(double weight) {
		this.weight = weight;	
	}
	
	public double getWeight() {
		return this.weight;	
	}

}

class Human extends Products{
	
	Human() {
		setName("MAN");
		setHeight(100);
		setWeight(50);
		System.out.println(this.getName() + this.getHeight() + this.getWeight());
		
	}
	
} 

class Machine extends Products{
	
	Machine() {
		setName("MACHINE");
		setHeight(100);
		setWeight(50);
		System.out.println(this.getName() + this.getHeight() + this.getWeight());
	}
	
} 
