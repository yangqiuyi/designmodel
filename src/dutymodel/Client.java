package dutymodel;

public class Client {
	public static void main(String args[]){
		FirstHandler firstHandler = new FirstHandler();
		SecondHandler secondHandler = new SecondHandler();
		ThirdHandler thirdHandler = new ThirdHandler();
		
		firstHandler.nextHandle = secondHandler;
		secondHandler.nextHandle = thirdHandler;
		
		firstHandler.handleRequest(10);
	}

}
