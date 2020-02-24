
public class ThreadSafeInts {
	
	//create private static class instance
		private static ThreadSafeInts instObj;
		
		private ThreadSafeInts() {
			//prevents creating object from other class
		}
		
		public synchronized static ThreadSafeInts getInstance() {
			if (instObj == null)
				instObj = new ThreadSafeInts();
			return instObj;
		}

		public static ThreadSafeInts BestgetInstance() {
			System.out.println("Hiiiiii1");		//next thread need not to wait these execute these stmts 
			System.out.println("Hiiiiii2");
			System.out.println("Hiiiiii3");
			synchronized(ThreadSafeInts.class) {
				if (instObj == null)
					instObj = new ThreadSafeInts();
			}
			return instObj;
		}
}
