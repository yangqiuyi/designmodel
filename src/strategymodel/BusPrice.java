package strategymodel;

public class BusPrice implements ICalculateStrategy{

	public int CalculatePrice(int km) {
		System.out.println("公交车计算价钱的方式" + km);
		return km;
		
	}

}
