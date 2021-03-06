
public class TestSingleTon {
	public static void main(String args[])
	{
		//ERROR - > SingleTon obj = new SingleTon();
		
		//Eager Instialisation
		EagerInts obj = EagerInts.getInstance();
		EagerInts obj2 = EagerInts.getInstance();
		System.out.println(obj == obj2);	
		obj.setValue("1");
		//System.out.println(obj.getValue());
		//System.out.println(obj2.getValue());
		
		//Static Block Instialisation
		StaticBlockInts obj3 = StaticBlockInts.getInstance();
		StaticBlockInts obj4 = StaticBlockInts.getInstance();
		System.out.println(obj3 == obj4);
		
		//Lazy Instialisation
		LazyInts obj5 = LazyInts.getInstance();
		LazyInts obj6 = LazyInts.getInstance();
		System.out.println(obj5 == obj6);
		
		//Thread Safe Instialisation
		ThreadSafeInts obj7 = ThreadSafeInts.getInstance();
		ThreadSafeInts obj8 = ThreadSafeInts.getInstance();
		System.out.println(obj7 == obj8);
		
	
		
		
	}

}


//String checking
		/*String val = "1";
		String val1 = "1";
		
		if(val==val1) {
			System.out.println("same address");
			System.out.println(obj2.hashCode());
			System.out.println(obj.hashCode());
		}
			
		else {
			System.out.println("diff address");
			System.out.println(val.hashCode());
			System.out.println(val1.hashCode());
		}*/
		//END