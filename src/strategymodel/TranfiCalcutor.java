package strategymodel;

//���Ե�����
public class TranfiCalcutor {
	
	ICalculateStrategy calculateStrategy;
	
	public  void Strategy(ICalculateStrategy calculateStrategy){
		this.calculateStrategy = calculateStrategy;
	}
	
	public int CalculatePrice(int km){
		return calculateStrategy.CalculatePrice(km);
	}

}
