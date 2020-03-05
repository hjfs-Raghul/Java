package example.products;

import example.ingredients.Ingredients;

public class Juice implements Products {
	Ingredients ingredients[];

	/*Juice() {
		System.out.println("Dummy Juice");
	}*/

	Juice(Ingredients ing1,Ingredients ing2) {
		this.ingredients[0] = ing1;
		this.ingredients[1] = ing2;
	}

	public String getProduct() {
		return "Juice Ready....";
	}

}
