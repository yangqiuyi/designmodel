package factory;

public class Client {
	public static void main(String args[]) {
		Factory factory = new ConcreteFactory();
		  Product product =   factory.createProduct();
		  product.method();
	}

}
