package sample;

public class RunnableDemo {
	public static void main(String args[]) {
	
		Runnable threadobj = () -> {
			for (int i = 0;i<10;i+=2)
				System.out.println("currentThread->"+Thread.currentThread().getName()+" i ->"+i);
		};
		new Thread(threadobj).start();
		new Thread(threadobj).start();
		
	}
	
	

}
