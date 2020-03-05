package example;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import example.products.Products;

public class Machine {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext machine;
		Products product;	
		System.out.println("Start");
		 machine= new ClassPathXmlApplicationContext("applicationContext.xml");

			//System.out.println("Start1");
		 //String userChoice = "";
		 //while(!userChoice.equalsIgnoreCase("exit")) {
		 	product = machine.getBean("coffee",Products.class);
		 	System.out.println(product.getProduct());
		 	
		 	
		 //}
		 	
	}
}
	