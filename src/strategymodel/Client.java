package strategymodel;

public class Client {
	public static void main(String[] args)
    {
		TranfiCalcutor tranfiCalcutor = new TranfiCalcutor();
		tranfiCalcutor.Strategy(new BusPrice());
		tranfiCalcutor.CalculatePrice(3);
    }
}
