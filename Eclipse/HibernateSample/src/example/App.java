package example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import example.repository.ProductRepository;
import example.service.ProductService;
import example.service.ProductServiceImpl;

public class App {
	public static void main(String[] args) {
//1. create the service
		ProductService productService;
		//ProductRepository repository;
		//productService= new ProductServiceImpl();
//. fetch the products from the service
		//productService.getProducts().forEach(System.out::println);
		
		ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
		System.out.println(app);
		productService = app.getBean("productService",ProductService.class);
		System.out.println("productService");
		productService.getProducts().forEach(System.out::println);
	}
}
