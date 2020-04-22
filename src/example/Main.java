package example;

public class Main {

	public static void main(String[] args) {
//		MedicalProducts p = new MedicalProducts();
//		p.createProduct();
//		p.updateProduct();
//		p.searchProduct("Cough");
//		p.removeProduct();
//		p.test();
		
		SomeProductImpl impl =new SomeProductImpl();
		impl.createProduct();
		impl.updateProduct();
		impl.searchProduct("Haritha");
		impl.removeProduct();
		impl.requirement1();

	}

}
