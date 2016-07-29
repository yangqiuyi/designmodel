package anotherbuildermodel;

public class Client {
	public static void main(String args[]) {
		BenChiBuilder bc = new BenChiBuilder();
		Director director = new Director(bc);
		bc.getCar();
		
		
	}

}
