package example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import example.service.ProductService;
import example.service.ProductServiceImpl;

public class App {
	public static void main(String[] args) {
//1. create the service
		ProductService productService;
		productService= new ProductServiceImpl();
//. fetch the products from the service
		productService.getProducts().forEach(System.out::println);
		ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
		productService = app.getBean("productRepository",ProductService.class);
		System.out.println("");
		productService.getProducts().forEach(System.out::println);
	}
}
