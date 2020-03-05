package example.products;

import java.util.ArrayList;
import java.util.List;

import example.ingredients.Ingredients;

public class Coffee implements Products {

	List<Ingredients> ingList = new ArrayList<Ingredients>();
	/*Coffee() {
		System.out.println("Dummy Coffee");
	}*/

	Coffee(Ingredients ing1,Ingredients ing2,Ingredients ing3) {
		System.out.println(ing1+"<-->"+ing2+"<-->"+ing3);
		System.out.println("Coffee Dependency Injection");
		ingList.add(ing1);
		ingList.add(ing2);
		ingList.add(ing3);
	}

	public String getProduct() {
		return "Coffee Ready....with"+ingList.get(0).toString()+ingList.get(1).toString()+ingList.get(2).toString();
	}
}
