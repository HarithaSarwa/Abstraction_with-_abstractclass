package example;

public class SomeProductImpl extends SomeProduct{

//	public void requirement1() {
//		System.out.println("Requirement from impl");
//	}

	public void createProduct() {
		System.out.println("Create product from impl");
		
	}
	public void updateProduct() {
		
		System.out.println("Update product from impl");
	}
	public void removeProduct() {
		
		System.out.println("Remove product from impl");
	}
	public void searchProduct(String name) {
		
		System.out.println("Search product name "+ name +"from impl");
	}
}
