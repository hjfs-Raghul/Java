package example.ingredients;

public class Sugar extends IngredientClass implements Ingredients{
	@Override
	public String getIngredient() {
		return "Sugar Added\n";
	}
}
