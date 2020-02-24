package sample;

class Demo1 implements FunctionalInterfaceDemo{
	@Override
	public void absFunc() {
		FunctionalInterfaceDemo lamb = ()->{System.out.println("Abstract Method");};
		System.out.println(lamb);
		//new Thread(lamb).start();
	}
	
	@Override
	public void defFunc() {
		System.out.println("Default Overridden Method");
	}
	
	FunctionalInterfaceDemo lambda = () -> {System.out.println("Abstract Lambda");};
}

public class Demo implements FunctionalInterfaceDemo{

	@Override
	public void absFunc() {
		
		
	}
	public static void main(String args[]) {
		new Demo1().absFunc();
		//System.out.println(lamb);
	}
	
} 