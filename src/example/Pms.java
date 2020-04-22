package example;

public abstract class Pms {

	

	// If a class has even one abstract method
	// The class should be declared as abstract
	// If a class dose'nt have abstract class
	// Then also it can be declared as abstract.
	public abstract void createProduct();
	public abstract void updateProduct();
	public abstract void removeProduct();
	public abstract void searchProduct(String name);
	public void test() {
		System.out.println("Hi");
	}
	public void requirement1() {
		
		System.out.println("Requirement 1 ");
	}

}
