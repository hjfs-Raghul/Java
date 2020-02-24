package sample;

@FunctionalInterface
interface FunctionalInterfaceCustom {
	public abstract void absFunc();// {
		//System.out.println("Abstrat Function");
	//}
	public static void statFunc() {
		System.out.println("Static Function");
	};
	public default void defFunc() {
		System.out.println("Default Function");
	};
}

//class FunctionalInterfaceDemoImpl{
//	public FunctionalInterfaceDemoImpl(FunctionalInterfaceDemo functionalInterfaceDemo) {
//		
//	}
//}

public class FunctionalInterfaceDemo{
	public static void main(String[] args) {
		FunctionalInterfaceCustom custom = () -> System.out.println("Test");
		custom.absFunc();
		custom = () -> System.out.println("Test1");
		custom.absFunc(); 
		custom.defFunc();
		FunctionalInterfaceCustom.statFunc();
	}
}