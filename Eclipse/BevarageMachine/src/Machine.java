import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import example.products.Coffee;
import example.products.Products;

public class Machine {
	static ApplicationContext machine;
	static Products product;
	public static void main(String[] args) {
		System.out.println("Start");
		 machine= new ClassPathXmlApplicationContext("applicationContext.xml");

			System.out.println("Start1");
		 //String userChoice = "";
		 //while(!userChoice.equalsIgnoreCase("exit")) {
		 	product = machine.getBean("coffee",Products.class);
		 	System.out.println(product.getProduct());
		 //}
		 	
	}
}
	