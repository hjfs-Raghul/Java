package sample;

public class Demo {
	public static void main(String args[]) {
		boolean flag = true;
		for(int i = 0;i<100;i++)
			{
			if(flag)
				System.out.println("Even ->"+i);
			else
				System.out.println("Odd ->"+i);
			flag = !flag;
			
			}
	}
} 
