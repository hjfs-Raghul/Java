package example.products;

import example.ingredients.IngredientClass;
import example.ingredients.Ingredients;
import example.ingredients.Milk;
import example.ingredients.Sugar;
import example.ingredients.Water;

public class Coffee implements Products {

	//IngredientsClass[] ingList;
	IngredientClass ingList[];
	Ingredients if_ingList[];
	Milk milk;
	Sugar sugar;
	Water water;
	/*Coffee() {
		System.out.println("Dummy Coffee");
	}*/

	Coffee(IngredientClass...ingredients) {
		//System.out.println(ing1+"<-->"+ing2+"<-->"+ing3);
		//System.out.println("Coffee Dependency Injection");
		/*this.ingList[0] =ing1;
		this.ingList[1] =ing2;
		this.ingList[2] =ing3;*/
		for (int i = 0;i<ingredients.length;i++) 
			ingList[i] =(IngredientClass) ingredients[i];
	}

	public String getProduct() {
		StringBuilder result = new StringBuilder("Coffee Ready\n");
		if(ingList.length > 0) {
			result.append("....with");
			for (int i = 0;i<ingList.length;i++)
				result.append(ingList[i].getIngredient());
		}
		return result.toString();
			
		
	}
}
