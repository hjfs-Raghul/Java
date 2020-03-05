package example.service;

import java.util.List;

import example.model.Product;
import example.repository.MySqlDBRepository;
import example.repository.ProductRepository;

public class ProductServiceImpl implements ProductService {
//1. Instantiate the OracleRepository and expose through and interface	@Override
	ProductRepository productRepository;

	/*public ProductServiceImpl() {
	 * 
		// productRepository = new OracleRepository();
		productRepository = new MySqlDBRepository();
	}*/
	
	public ProductServiceImpl(ProductRepository productRepository) {
		System.out.println("Dependency Injection");
		this.productRepository = productRepository;
	}

	public List<Product> getProducts() {

		// 2. Return the list of products from the repository
		return this.productRepository.getProducts();
	}

}
