package example.model;
public class Products {
	private String prodId;
	private String prodName;
	public String getProdId() {
		return prodId;
	}
	public void setProdId(String prodId) {
		this.prodId = prodId;
	}
	public String getProdName() {
		return prodName;
	}
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}
	
	public String toString ()
	{
		return "Product ID -> "+this.getProdId() + " Product Name -> "+this.getProdName();
	}

}
