package factory;

public class ConcreteFactory  extends Factory {

	@Override
	public Product createProduct() {
		return new ConcreteProductA();
	}
	

}
