package strategymodel;

//策略的引用
public class TranfiCalcutor {
	
	ICalculateStrategy calculateStrategy;
	
	public  void Strategy(ICalculateStrategy calculateStrategy){
		this.calculateStrategy = calculateStrategy;
	}
	
	public int CalculatePrice(int km){
		return calculateStrategy.CalculatePrice(km);
	}

}
