package strategymodel;

public class SubwayPrice implements ICalculateStrategy {

	public int CalculatePrice(int km) {
		System.out.println("地铁计算价钱的方式" + km);
		return km;
		
	}

}
