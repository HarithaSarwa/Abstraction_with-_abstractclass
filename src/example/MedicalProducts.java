package example;

public class MedicalProducts extends Pms{

	@Override
	public void createProduct() {
		System.out.println("Product created in MYSQL DB");
		
	}

	@Override
	public void updateProduct() {
		System.out.println("Product updated in MYSQL DB");
		
	}

	@Override
	public void removeProduct() {
		System.out.println("Product removed in MYSQL DB");
		
	}

	public void searchProduct(String name) {
		System.out.println("Product with name "+name+ " was searched in MYSQL BD");
		
	}
	public void test() {
		System.out.println("Medical products");
	}

	
}
