package strategymodel;

public class SubwayPrice implements ICalculateStrategy {

	public int CalculatePrice(int km) {
		System.out.println("���������Ǯ�ķ�ʽ" + km);
		return km;
		
	}

}
